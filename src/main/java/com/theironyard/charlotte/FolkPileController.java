package com.theironyard.charlotte;

import org.hibernate.jpa.HibernateEntityManager;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.hibernate.jpa.internal.EntityManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.HashSet;

/**
 * Created by Ben on 9/8/16.
 */
@Controller
public class FolkPileController {
    @Autowired
    PersonRepository people;

    @Autowired
    AddressRepository addresses;

    @RequestMapping(path = "/")
    @ResponseBody
    Person home() {

        Person test = people.findOne(1);

        return test;
    }
}
