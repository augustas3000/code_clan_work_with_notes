package com.example.codeclan.coursetracker.controllers;


import com.example.codeclan.coursetracker.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping(value = "bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    // /bookings?date=10-12-2019

    @GetMapping
    public ResponseEntity findBookingQueryString(
            @RequestParam(required = false, name = "date") String date){
        if (date != null){


            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-L-yyyy", Locale.ENGLISH);
            LocalDate localDate = LocalDate.parse(date, formatter);
            ZoneId defaultZoneId = ZoneId.systemDefault();
            Date dateConverted = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

            return new ResponseEntity<>(bookingRepository.findByDate(dateConverted), HttpStatus.OK);
        }
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

}
