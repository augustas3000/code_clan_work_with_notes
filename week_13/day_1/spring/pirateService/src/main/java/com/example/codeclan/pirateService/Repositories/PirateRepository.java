package com.example.codeclan.pirateService.Repositories;

import com.example.codeclan.pirateService.Models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Jpa - library
public interface PirateRepository extends JpaRepository<Pirate, Long> {
//    own repository interface inherits all behaviours and state(no state as Jpa is only an interface) from Jpa repo.
//repo - a eway of accessing some resource;


//    a derived query; but cant write full blown methods since its an interface, only abstracts - prototypes

//    BUT, JPA derived query looks at the method name, depending on how the method name is structured,
//    it will generate a query from the name!

//    LETS try finding all the pirates by first name:

//    What do I want back? - A List of pirates: List<Pirate>
//    What data do i have? - String name = "colin"

//    structure of derived query:
//    operation<object>By<property><operator> where:
//    operation: find(also read, get), count
//    object: teh class that we are getting back(optional) - Pirate,
//    property: property the object has, eg. firstName
//    so the result is basically a method prototype thsu allowed in interface;
    List<Pirate> findPirateByFirstName(String firstName);
    List<Pirate> findByAge(int Age);


//    write a query to find all pirates over a certain age
//    What do I have ? - teh age
//    What do I want? - a list of pirate objects

//    operation<object>By<property>[modifier]<operator>
//    modifier: GreaterThan, LessThan

    List<Pirate> findByAgeGreaterThan(int age);


    List<Pirate> findByAgeGreaterThanEqualAndAgeLessThanEqual(int ageGreater, int ageLess);


}
