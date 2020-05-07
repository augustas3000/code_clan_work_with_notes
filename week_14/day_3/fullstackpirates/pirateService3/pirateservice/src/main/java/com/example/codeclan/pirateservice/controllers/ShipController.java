package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value="/ships")
    public ResponseEntity<List<Ship>> getAllShips(){
        return new ResponseEntity<>(shipRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/ships/{id}")
    public ResponseEntity<Optional<Ship>> getShip(@PathVariable Long id){
        return new ResponseEntity<>(shipRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/ships")
    public ResponseEntity postShip(@RequestBody Ship ship){
        shipRepository.save(ship);
        return new ResponseEntity(ship, HttpStatus.CREATED);
    }

    //http://localhost:8080/ships/pirates/named/jack
    @GetMapping(value="/ships/pirates/named/{name}")
    public List<Ship> findShipsThatHavePiratesName(@PathVariable String name){
        return shipRepository.findShipByPiratesFirstName(name);
    }

    //http://localhost:8080/ships/pirates?named=John
    @GetMapping(value = "/ships/pirates")
    public ResponseEntity findShipsThatHavePiratesNamedQueryString(@RequestParam(name="named") String name){
        return new ResponseEntity(shipRepository.findShipByPiratesFirstName(name), HttpStatus.OK);
    }



}