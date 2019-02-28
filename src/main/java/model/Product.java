package model;

import javax.persistence.*;

@Entity(name = "Product")
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double id;
    private String title;
    @ManyToOne
    private ProductCategory category;
    @Version
    private Double version;

    protected Product() {

    }

    public Product(String title, ProductCategory category) {
        if (title == null || category == null) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.category = category;
    }

}
