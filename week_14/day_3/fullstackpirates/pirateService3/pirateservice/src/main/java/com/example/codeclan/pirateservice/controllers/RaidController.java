package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

//    @GetMapping
//    public ResponseEntity<List<Raid>> getAllRaids(){
//        return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Raid>> getRaid(@PathVariable Long id){
        return new ResponseEntity<>(raidRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity postRaid(@RequestBody Raid raid){
        raidRepository.save(raid);
        return new ResponseEntity(raid, HttpStatus.CREATED);
    }

    //http://localhost:8080/raids/filter?located=Barbados
    @GetMapping(value = "/filter")
    public ResponseEntity findRaidByLocationQueryString(@RequestParam(name="located") String location){
        return new ResponseEntity(raidRepository.findRaidByLocation(location), HttpStatus.OK);
    }

    @GetMapping
    //http://localhost:8080/raids?location=Barbados
    public ResponseEntity findRaidsFilterByLocation(@RequestParam(name="location", required = false) String location){
        if (location != null){
            return new ResponseEntity(raidRepository.findRaidByLocation(location), HttpStatus.OK);
        }
        //http://localhost:8080/raids
        return new ResponseEntity(raidRepository.findAll(), HttpStatus.OK);
    }

}
