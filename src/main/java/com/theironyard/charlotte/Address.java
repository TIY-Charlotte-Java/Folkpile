package com.theironyard.charlotte;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/8/16.
 */
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "street")
    String street;

    @ManyToMany
    @JoinTable
    List<Person> people = new ArrayList<>();

    public String getStreet() {
        return street;
    }

    public int getId() {
        return id;
    }

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }

    public Address addPersonToAddress(Person p, CrudRepository repo) {
        people.add(p);
        p.addresses.add(this);

        repo.save(this);
        return this;
    }
}
