package model;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double id;
    @Column(unique = true, nullable = false)
    private String email;
    private String name;
    @Version
    private Double version;

    protected User() {

    }

    public User(String email, String name) {
        if (email == null || name == null) {
            throw new IllegalArgumentException();
        }
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " EMAIL: " + email + " NAME: " + name;
    }

}
