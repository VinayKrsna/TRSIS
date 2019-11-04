package info.stepanoff.trsis.samples.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Pavel
 */
@Entity
@Table(name = "Producer")
public class Producer {

    public Producer() {
    }

    public Producer(Integer id, String nomer) {
        this.id = id;
        this.number = nomer;

    }

    @Id
    @Column(name = "producer_id")
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Column(name = "producer_number")
    private String number;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Column(name = "producer_product_id")
    private Integer product;

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getProduct() {
        return product;
    }

}
