package com.example.PiratesStuffClassThing.Repositories;

import com.example.PiratesStuffClassThing.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
