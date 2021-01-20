package com.example.PiratesStuffClassThing.Repositories;

import com.example.PiratesStuffClassThing.Models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaidRepository extends JpaRepository<Raid, Long> {
    List<Raid> findRaidByLocation(String location);

}
