package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PirateserviceApplicationTests {

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
	public void createPirateAndShip(){
//		Ship ship = new Ship("The Flying Dutchman");
//		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship);
//		Raid raid = new Raid("Glasgow", 50);
//		shipRepository.save(ship);
//		pirateRepository.save(jack);
//		raidRepository.save(raid);
//
//		jack.addRaidToPirate(raid);
//		pirateRepository.save(jack);
	}

	@Test
	public void canFindPirateByFirstName(){
		List<Pirate> foundPirates = pirateRepository.findPirateByFirstName("Bartholomew");
		assertEquals(2,foundPirates.size());
		assertEquals("Bartholomew", foundPirates.get(0).getFirstName());
	}

	@Test
	public void canFindPirateOverAge(){
		List<Pirate> foundPirates = pirateRepository.findPirateByAgeGreaterThan((35));
		assertEquals(6,foundPirates.size());
	}

	@Test
	public void canFindPirateOverAgeAndUnderAge(){
		List<Pirate> foundPirates = pirateRepository.findPirateByAgeGreaterThanAndAgeLessThan(41,43);
		assertEquals(1,foundPirates.size());
	}

	@Test
	public void canFindShipsByPiratesFirstName(){
		List<Ship> foundShips = shipRepository.findShipByPiratesFirstName("Jack");
		assertEquals("The Black Pearl",foundShips.get(0).getName());
	}

	@Test
	public void canFindRaidByShipName(){
		List<Raid> foundRaids = raidRepository.findRaidByPiratesShipName("The Black Pig");
		assertEquals(2,foundRaids.size());
	}


}
