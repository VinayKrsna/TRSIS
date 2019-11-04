package info.stepanoff.trsis.samples.service;

import info.stepanoff.trsis.samples.db.model.Product;

public interface ProductService {

    Iterable<Product> listAll();

    void delete(Integer id);
    
    Product add(Integer number, String name);
    
    Product findByNumber(Integer number);

}
