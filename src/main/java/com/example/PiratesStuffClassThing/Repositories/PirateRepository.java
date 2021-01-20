package com.example.PiratesStuffClassThing.Repositories;

import com.example.PiratesStuffClassThing.Models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {
    List<Pirate> findByAgeGreaterThan(int age);
}
