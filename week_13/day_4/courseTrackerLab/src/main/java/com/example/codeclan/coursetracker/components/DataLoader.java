package com.example.codeclan.coursetracker.components;

import com.example.codeclan.coursetracker.models.Booking;
import com.example.codeclan.coursetracker.models.Course;
import com.example.codeclan.coursetracker.models.Customer;
import com.example.codeclan.coursetracker.repositories.BookingRepository;
import com.example.codeclan.coursetracker.repositories.CourseRepository;
import com.example.codeclan.coursetracker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Python", "Glasgow", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Java", "Edinburgh", 4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Iain", 32, "Glasgow");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Gus", 28, "Edinburgh");
        customerRepository.save(customer2);

//        we will provide date in string format, and the constructor will use that to create time object:


        Booking booking1 = new Booking("10-12-2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("10-12-2020", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("10-12-2030", course2, customer1);
        bookingRepository.save(booking3);
    }
}
