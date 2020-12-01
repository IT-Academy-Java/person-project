package com.itacademy.person.repository;

import com.itacademy.person.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPersonRepository extends CrudRepository<Person, Long> {

}
