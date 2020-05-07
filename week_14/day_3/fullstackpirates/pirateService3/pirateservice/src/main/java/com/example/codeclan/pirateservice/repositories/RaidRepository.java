package com.example.codeclan.pirateservice.repositories;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {


    //Find all raids with ship name The Black Pig
    List<Raid> findRaidByPiratesShipName(String shipName);

    //Find raid by location name
    List<Raid> findRaidByLocation(String locationName);

}

