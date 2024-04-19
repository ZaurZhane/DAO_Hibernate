package ru.netology.hibernate.service;

import ru.netology.hibernate.entity.Person;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.repository.ApplicationRepository;

import java.util.List;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Person> getPersonByCity(String city) {
        return applicationRepository.getPersonByCity(city);
    }

}
