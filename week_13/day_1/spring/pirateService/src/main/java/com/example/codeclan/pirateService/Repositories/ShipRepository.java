package com.example.codeclan.pirateService.Repositories;

import com.example.codeclan.pirateService.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {


//    to do:
//    find all ships that have pirates with firstName jack;

//    want: a list of ships, so we start on ships
//    got: firstName

//    write a query to span across
//    proeprty pirates helps us to span across:
    List<Ship> findByPiratesFirstName(String name);

//    List<Ship> findByPiratesRaidsLocation for example
}
