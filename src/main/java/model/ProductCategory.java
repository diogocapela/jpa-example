package model;

import javax.persistence.*;

@Entity(name = "ProductCategory")
@Table(name = "ProductCategory")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double id;
    private String title;
    @Version
    private Double version;

    protected ProductCategory() {

    }

    public ProductCategory(String title) {
        if (title == null) {
            throw new IllegalArgumentException();
        }
        this.title = title;
    }

}
