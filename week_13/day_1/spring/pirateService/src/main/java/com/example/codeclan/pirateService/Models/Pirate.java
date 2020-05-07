package com.example.codeclan.pirateService.Models;


// POJO - plain old java object rules:
// All attribs to be saved to db should be private and have getters and setters
// Need a default constructor;
// A long id - to be used by db;


//JPA -JAVAX persistence API;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
//an entity in a database

@Entity
@Table(name="pirates")
public class Pirate {
//    annotate inst vars to be used as table colums;
//    for db will be used by db
//    map id to primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

//    many pirates to one ship - many pirates has one ship
//    The @ManyToOne annotation is used to set the relationship between Pirate and Ship classes.
//
//The @JoinColumn annotation will generate a column ship_id (a foreign key) in the pirates table
// which will point to the id of the ships table (primary key). JPA + Hibernate will take care of
// this for us. We only need to worry about the Java side which is why we don’t give the Pirate class
// a ship_id property.

    @JsonIgnoreProperties(value = "pirates")
    @ManyToOne
    @JoinColumn(name="ship_id", nullable = false)
    private Ship ship;


//    @ManyToMany. It should be used to annotate properties of a class or the properties getters.
//    Typically these properties are of type Collection, List or ArrayList
//    this annotation instruct to create the table with Jpsa
//    set up as a join table;
//    @JsonBackReference
    @JsonIgnoreProperties(value = "pirates")
    @ManyToMany
    @JoinTable(
            name = "pirates_raids",
            joinColumns = {@JoinColumn(name = "pirate_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "raid_id", nullable = false, updatable = false)}
    )
    private List<Raid> raids;


    public Pirate(String firstName, String lastName, int age, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;
        this.raids = new ArrayList<>();
    }

//    default constructor
    public Pirate() {
    }

    public void addRaid(Raid raid) {
        this.raids.add(raid);
    }


//    private + get n set, + default constructor for db functionality

    public List<Raid> getRaids() {
        return raids;
    }

    public Ship getShip() {
        return ship;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }
}
