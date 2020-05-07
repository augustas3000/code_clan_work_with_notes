package com.example.codeclan.pirateService;

import com.example.codeclan.pirateService.Models.Pirate;
import com.example.codeclan.pirateService.Models.Raid;
import com.example.codeclan.pirateService.Models.Ship;
import com.example.codeclan.pirateService.Repositories.PirateRepository;
import com.example.codeclan.pirateService.Repositories.RaidRepository;
import com.example.codeclan.pirateService.Repositories.ShipRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class PirateServiceApplicationTests {
//	in bcgrnd spring created an instance from the interface:
	@Autowired
	PirateRepository pirateRepository;


	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShip() {

		Ship ship;
		ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate jack;
		jack = new Pirate("Jack","Sparrow",32,ship);
		pirateRepository.save(jack);

		Pirate joe;
		joe = new Pirate("Joe","Some",30,ship);
		pirateRepository.save(joe);

		Pirate kelly;
		kelly = new Pirate("Kelly","Kookooo", 30, ship);
		pirateRepository.save(kelly);


		Raid raid;
		raid = new Raid("Laplandia",3000);
		raidRepository.save(raid);
//		now the raid will have an id;


		raid.addPirate(jack);
		raid.addPirate(joe);

		raidRepository.save(raid);
//		dependency injection - an object is instantiated somewhere else and then given to you;

		kelly.addRaid(raid);
		pirateRepository.save(kelly);

	}

	@Test
	public void canFindPirateByFirstName() {
//		given we have two Barts, when we query for all pirates FirstName Bartholomew
//		then well get a list of two pirates back and theyll both be called Bartholomew:

		List<Pirate> foundPirates = pirateRepository.findPirateByFirstName("Bartholomew");

//		System.out.println(foundPirates.get(0).getFirstName());
//		assertEquals("Bartholomew", foundPirates.get(0).getFirstName());

		List<Pirate> foundPiratesUsingAge = pirateRepository.findByAgeGreaterThan(35);
//		assertEquals(5, foundPiratesUsingAge.size());
		System.out.println(foundPiratesUsingAge.size());

		List<Pirate> foundPirates3 = pirateRepository.findByAgeGreaterThanEqualAndAgeLessThanEqual(35,55);
		System.out.println(foundPirates3.size());
		pirateRepository.deleteAll(foundPirates3);


	}

	@Test
	public void canFindShipsByPiratesFirstName() {
		List<Ship> founShips = shipRepository.findByPiratesFirstName("Jack");
		assertEquals("","The Black Pearl",founShips.get(0).getName());


		List<Raid> foundRaids = raidRepository.findByPiratesShipName("The Black Pig");
		System.out.println(foundRaids);
	}

	@Test
	public void canFindRaidsByLocation() {
		System.out.println(raidRepository.findByLocation("Barbados"));
	}




}
