package com.example.crudfootballer.service;

import com.example.crudfootballer.entity.Footballer;
import com.example.crudfootballer.repository.FootballerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballerService {

    @Autowired
    private FootballerRepository footballerRepository;

    public void save (Footballer f) {
        footballerRepository.save(f);
    }

    public List<Footballer> getallFootballers() {
        return footballerRepository.findAll();
    }

    public Footballer getFootballerById(int id) {
        return footballerRepository.findById(id).get();
    }

    public void deleteById(int id) {
        footballerRepository.deleteById(id);
    }

}
