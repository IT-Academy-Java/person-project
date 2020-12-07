package com.itacademy.person.controller;

import com.itacademy.person.entity.Person;
import com.itacademy.person.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @GetMapping("/")
    public Iterable<Person> getPerson(){
        Iterable<Person> listPersons = personService.getPeople();
        return listPersons;
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return (ResponseEntity<Person>) ResponseEntity.ok().body(personService.save(person));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person, @PathVariable("id") Long id){
        person.setIdPersona(id);
        return (ResponseEntity<Person>) ResponseEntity.ok().body(personService.save(person));
    }
}
