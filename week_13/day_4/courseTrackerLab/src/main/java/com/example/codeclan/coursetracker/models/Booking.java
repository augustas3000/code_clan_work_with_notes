package com.example.codeclan.coursetracker.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
//    @Column(name = "date")
    private Date date;
//    @Column(name = "date")
//    private String date;

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    // Todo: customer
//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Booking(String dateString, Course course, Customer customer) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-L-yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        ZoneId defaultZoneId = ZoneId.systemDefault();

        this.date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        this.course = course;
        this.customer = customer;

//        once the bookign has been created:
//        push booking to customer's "bookings" array
//        push booking to courses bookings array

//        OR - create object methods and call them in data loadeer and then save
    }

    public Booking(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
