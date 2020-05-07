package com.example.codeclan.pirateService.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
//    one ship to many pirates - one ship has many pirates.
//    property on pirate called ship, which will be ship id.

//    @OneToMany takes an argument mappedBy which needs to have the name
//    of the property in Pirate class that we wish to use as the foreign key.

    @JsonIgnoreProperties(value = "pirates")
    @OneToMany(mappedBy = "ship")
    private List<Pirate> pirates;

    public Ship(String name) {
//        id is not in constructor, as we create instance of it we dont know what the id is. Only when its saved to db?
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }

    public Ship() {

    }



    public void addPirate(Pirate pirate) {
        this.pirates.add(pirate);
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }
}
