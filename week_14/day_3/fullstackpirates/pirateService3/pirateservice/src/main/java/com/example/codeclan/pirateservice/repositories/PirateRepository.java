package com.example.codeclan.pirateservice.repositories;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    // JPA Derived query looks at the method name
    // depending on how the method name is structures - it will generate a query from the name.

    //E.g.: Find a pirate by first name ("Colin")
    // We want back: List<Pirate>

//    operation<Object>By<property><operator> where:
//    Operation:
    //-- find OR read OR get
    //-- count
//    Object: the class you're getting back (optional)
//    property: property the object has e.g. firstName

//    operation<Object>By<property><operator>
    List<Pirate> findPirateByFirstName(String firstName);
    List<Pirate> findPirateByAge(int age);

    //TODO: write a query to find all pirates OVER a certain age
//    operation<Object>By<property>[modifier]<operator>
//    Modifier: GreaterThan
//              LessThan
//              LessThenOrEqualTo
    List<Pirate> findPirateByAgeGreaterThan(int age);

    List<Pirate> findPirateByAgeGreaterThanAndAgeLessThan(int ageGreater, int ageLess);


}
