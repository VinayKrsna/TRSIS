package info.stepanoff.trsis.samples.db.dao;

import info.stepanoff.trsis.samples.db.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pavel
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

     public Product findByNumber(Integer number);
}
