package com.theironyard.charlotte;

import javax.persistence.*;

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

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
