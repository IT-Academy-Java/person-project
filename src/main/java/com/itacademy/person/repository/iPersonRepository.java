package com.itacademy.person.repository;

import com.itacademy.person.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface iPersonRepository extends CrudRepository<Person, Long> {

}
