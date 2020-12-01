package com.itacademy.person.service.impl;

import com.itacademy.person.entity.Person;
import com.itacademy.person.repository.IPersonRepository;
import com.itacademy.person.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonRepository iPersonRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Person> getPeople() {
        return (List<Person>) iPersonRepository.findAll();
    }

    @Override
    @Transactional
    public Person save(Person person) {
        return iPersonRepository.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        iPersonRepository.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {
        return iPersonRepository.findById(person.getIdPersona()).orElse(null);
    }
}
