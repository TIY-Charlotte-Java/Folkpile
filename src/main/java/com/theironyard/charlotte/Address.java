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
    List<Person> people = new ArrayList<>();
}
