package com.example.codeclan.pirateService.Repositories;

import com.example.codeclan.pirateService.Models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//repository lets us handle the database - we specigy the type in <type, id>
@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {


//    all raids, that had The Black Pig ship.
    List<Raid> findByPiratesShipName(String shipName);

//    find raids by location name
    List<Raid> findByLocation(String location);
}
