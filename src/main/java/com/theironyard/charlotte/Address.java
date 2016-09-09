package com.theironyard.charlotte;

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
    @JoinTable(name = "people_addresses",
            joinColumns        = @JoinColumn(name = "person_id",      referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id"))
    List<Person> people = new ArrayList<>();

    public String getStreet() {
        return street;
    }

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }
}
