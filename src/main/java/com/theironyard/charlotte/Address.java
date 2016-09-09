package com.theironyard.charlotte;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Ben on 9/8/16.
 */
@Entity
@Table(name = "addresses")
public class Address {
    @ManyToMany
    List<Person> people;

}
