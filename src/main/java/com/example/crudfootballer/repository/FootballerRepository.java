package com.example.crudfootballer.repository;

import com.example.crudfootballer.entity.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballerRepository extends JpaRepository<Footballer, Integer> {
}
