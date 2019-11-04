package info.stepanoff.trsis.samples.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.stepanoff.trsis.samples.db.dao.ProductRepository;
import info.stepanoff.trsis.samples.db.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

    private final static Logger log = Logger.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> listAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(Integer id) { productRepository.delete(id);
    }

    @Override
    public Product add(Integer number, String name) {
        return productRepository.save(new Product(number, name));
    }

    @Override
    public Product findByNumber(Integer number) {
        return productRepository.findByNumber(number);
    }

}
