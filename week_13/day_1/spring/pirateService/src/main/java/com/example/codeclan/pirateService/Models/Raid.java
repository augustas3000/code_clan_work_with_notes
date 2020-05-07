package com.example.codeclan.pirateService.Models;

import com.example.codeclan.pirateService.Repositories.RaidRepository;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "raids")

public class Raid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "location")
    private String location;

    @Column(name = "loot")
    private int loot;

    @JsonIgnoreProperties(value = "raids")
    @ManyToMany
    @JoinTable(
            name = "pirates_raids",
            joinColumns = { @JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Pirate> pirates;

    public Raid(String location, int loot) {
        this.location = location;
        this.loot = loot;
        this.pirates = new ArrayList<>();
    }

    public Raid() {
    }


    public String getLocation() {
        return location;
    }

    public int getLoot() {
        return loot;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public void addPirate(Pirate pirate) {
        this.pirates.add(pirate);
    }

    public Long getId() {
        return id;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }
}
