package com.codeclan.example.WhiskyTracker.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 1. Encapsulation - It describes the idea of bundling data and methods that work on that data within one unit,
// e.g., a class in Java.
// 2. This concept is also often used to hide the internal representation, or state, of an object from the outside.
// This is called information hiding. The general idea of this mechanism is simple. If you have an attribute that is
// not visible from the outside of an object, and bundle it with methods that provide read or write access to it,
// then you can hide specific information and control access to the internal state of the object.

//In this case, we define a Class Distillery - model, which will represent data in distilleries table.
// As is common in encapsulation, we keep our instance variables private, and give access to them through public
//instance methods - getters/setters - read/write access.

@Entity
@Table(name = "distilleries")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private String region;

    @JsonManagedReference
    @OneToMany(mappedBy = "distillery", fetch = FetchType.LAZY)
    private List<Whisky> whiskies;

    public Distillery(String name, String region) {
        this.name = name;
        this.region = region;
        this.whiskies = new ArrayList<>();
    }

    public Distillery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Whisky> getWhiskies() {
        return whiskies;
    }

    public void setWhiskies(List<Whisky> whiskies) {
        this.whiskies = whiskies;
    }
}

