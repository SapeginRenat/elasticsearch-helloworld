package com.example.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  @Autowired
  private PersonRepo personRepo;

  @GetMapping
  public Iterable<Person> getAllPerson() {
    return personRepo.findAll();
  }

  @PostMapping
  public Person saveOnePerson(@RequestBody Person person) {
    personRepo.save(person);
    return person;
  }

}
