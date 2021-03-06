package com.theironyard.charlotte;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ben on 9/8/16.
 */
@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String name;

    @ManyToMany(mappedBy = "people")
    List<Address> addresses = new ArrayList<>();

    public Person(){
    }

    public Person(String name) {
        this();

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Person addAddressToPerson(Address a, CrudRepository repo) {
        addresses.add(a);
        a.people.add(this);

        repo.save(this);
        return this;
    }
}
