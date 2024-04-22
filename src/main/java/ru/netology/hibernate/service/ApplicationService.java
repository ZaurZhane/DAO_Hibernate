package ru.netology.hibernate.service;

import org.springframework.http.ResponseEntity;
import ru.netology.hibernate.entity.Person;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.repository.ApplicationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Person> getPersonByCity(String city) {
        return applicationRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThan(int age) {
        return applicationRepository.findByPersonKeyAgeLessThanOrderByPersonKeyAgeAsc(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return applicationRepository.findByPersonKeyNameAndPersonKeySurname(name, surname);

    }

}
