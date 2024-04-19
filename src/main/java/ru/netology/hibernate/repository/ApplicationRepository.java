package ru.netology.hibernate.repository;

import ru.netology.hibernate.entity.Person;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ApplicationRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE lower(p.cityOfLiving) = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }

}
