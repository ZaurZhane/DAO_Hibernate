package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.hibernate.entity.Person;

import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.PersonKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Person, PersonKey> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByPersonKeyAgeLessThanOrderByPersonKeyAgeAsc(int age);

    Optional<Person> findByPersonKeyNameAndPersonKeySurname(String name, String surname);

}
