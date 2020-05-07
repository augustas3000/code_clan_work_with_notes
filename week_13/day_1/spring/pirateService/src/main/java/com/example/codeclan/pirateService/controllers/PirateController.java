package com.example.codeclan.pirateService.controllers;
import com.example.codeclan.pirateService.Models.Pirate;
import com.example.codeclan.pirateService.Repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pirates")
public class PirateController {

//    well make routes here

    @Autowired
    PirateRepository pirateRepository;

//    all pirates - GET INDEX
//    @GetMapping
//    public ResponseEntity<List<Pirate>> getAllPirates() {
////        gets objects from db and serializes them into json
////        payload we want to deliver, and sttus code
//        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
//
//    }

//    get pirate by ID - GET one pirate/raid/ship

//    optional - a container object
    @GetMapping("/{id}")
//    there may not be a pirate with certain id - hence Optional.
    public ResponseEntity<Optional<Pirate>> getPirate(@PathVariable Long id) {
        return new ResponseEntity<>(pirateRepository.findById(id), HttpStatus.OK);
    }

//    GET one pirate/raid/ship
//    GET a pirate's raids
//    get a specific raid from pirate


//    post req to /pirates
    @PostMapping
    public ResponseEntity postPirate(@RequestBody Pirate pirate) {
        pirateRepository.save(pirate); //mutates as well with id
        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getByAgeGreaterThanEqualAndLessThanEqual(

//            two request params
            @RequestParam(required = false, name = "ageGreater") Integer ageGreater,
            @RequestParam(required = false, name = "ageLess") Integer ageLess

    ) {

        if(ageGreater != null && ageLess != null) {
            return new ResponseEntity<>(pirateRepository.findByAgeGreaterThanEqualAndAgeLessThanEqual(ageGreater,ageLess), HttpStatus.OK);
        }

        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
    }

}
