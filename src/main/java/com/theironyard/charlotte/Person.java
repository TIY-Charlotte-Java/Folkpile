package com.theironyard.charlotte;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ben on 9/8/16.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String name;

    @ManyToMany(mappedBy = "people")
    List<Address> addresses;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
