<%--
  Created by IntelliJ IDEA.
  User: mor
  Date: 14.09.2019
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Online shopping list.</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Shopping list.</h1>
</div>

<div class="w3-container w3-center">
    <div class="w3-bar w3-padding-large w3-padding-24">
        <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/list'">Show shopping list</button>
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/add'">Add product</button>
        <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/rename'">Rename product</button>
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/delete'">Delete product</button>
    </div>
</div>
</body>
</html>
