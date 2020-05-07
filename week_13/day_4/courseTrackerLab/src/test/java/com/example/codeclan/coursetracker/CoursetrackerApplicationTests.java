package com.example.codeclan.coursetracker;

import com.example.codeclan.coursetracker.models.Booking;
import com.example.codeclan.coursetracker.models.Course;
import com.example.codeclan.coursetracker.models.Customer;
import com.example.codeclan.coursetracker.repositories.BookingRepository;
import com.example.codeclan.coursetracker.repositories.CourseRepository;
import com.example.codeclan.coursetracker.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@SpringBootTest
class CoursetrackerApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindCourseByRating(){
		List<Course> foundCourses;
		foundCourses = courseRepository.findByRating(4);
	}

	@Test
	public void canFindCustomersByCourse(){
		List<Customer> foundCustomers;
		foundCustomers = customerRepository.findByBookingsCourseNameIgnoreCase("Java");
	}

	@Test
	public void canFindCourseByCustomerName(){
		List<Course> foundCourses;
		foundCourses = courseRepository.findByBookingsCustomerName("Iain");
	}

//	@Test
//	public void canFindBookingByDate(){
//		List<Booking> foundBookings;
//		foundBookings = bookingRepository.findByDate("June");
//	}

	@Test
	public void canFindCustomerByTownAndCourse(){
		List<Customer> foundCustomers;
		foundCustomers = customerRepository.findByTownIgnoreCaseAndBookingsCourseNameIgnoreCase("Glasgow", "Python");
	}

	@Test
	public void canFindCustomerByAgeGreaterThanAndBookingCourseName(){
		List<Customer> foundCustomer;
		foundCustomer = customerRepository.findByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseNameIgnoreCase(30, "Glasgow", "Python");
	}

	@Test
	public void datesStuff() {

		String string = "12-11-2018";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-L-yyyy", Locale.ENGLISH);
		LocalDate localDate = LocalDate.parse(string, formatter);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		System.out.println(date);

	}
}
