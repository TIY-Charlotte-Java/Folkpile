package com.theironyard.charlotte;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben on 9/8/16.
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
