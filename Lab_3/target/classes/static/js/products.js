var app = angular.module('products', []);

app.controller("ProductsController", function ($scope, $http) {

    $scope.successGetProductsCallback = function (response) {
         $scope.productsList = response.data;
        $scope.errormessage="";
    };

    $scope.errorGetProductsCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get list of products";
    };

    $scope.getProducts = function () {
        $http.get('/public/rest/products').then($scope.successGetProductsCallback, $scope.errorGetProductsCallback);
    };

    $scope.successDeleteProductCallback = function (response) {
        for (var i = 0; i < $scope.productsList.length; i++) {
            var j = $scope.productsList[i];
            if (j.id === $scope.deletedId) {
                $scope.productsList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeleteProductCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete product; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deleteProduct = function (id) {
        $scope.deletedId = id;
        $http.delete('/public/rest/products/' + id).then($scope.successDeleteProductCallback, $scope.errorDeleteProductCallback);
    };


    $scope.successGetProductCallback = function (response) {
        $scope.productsList.splice(0, 0, response.data);
        $scope.errormessage="";
    };

    $scope.errorGetProductCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get information on product number "+$scope.inputnumber;
    };

    $scope.successAddProductCallback = function (response) {
        $http.get('/public/rest/products/' + $scope.inputnumber).then($scope.successGetProductCallback, $scope.errorGetProductCallback);
        $scope.errormessage="";
    };

    $scope.errorAddProductCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new product; check if it's number is unique";
    };

    $scope.addProduct = function () {
        $http.post('/public/rest/products/' + $scope.inputnumber + "/" + $scope.inputname).then($scope.successAddProductCallback, $scope.errorAddProductCallback);
    };

});
