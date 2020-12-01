package com.itacademy.person.service;

import com.itacademy.person.entity.Person;

import java.util.List;

public interface IPersonService {

    public List<Person> getPeople();

    public Person save(Person person);

    public void delete(Person person);

    public Person findPerson(Person person);

}
