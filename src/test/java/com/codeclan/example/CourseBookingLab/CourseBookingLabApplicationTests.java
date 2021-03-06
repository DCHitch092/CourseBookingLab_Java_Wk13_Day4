package com.codeclan.example.CourseBookingLab;

import com.codeclan.example.CourseBookingLab.models.Booking;
import com.codeclan.example.CourseBookingLab.models.Course;
import com.codeclan.example.CourseBookingLab.models.Customer;
import com.codeclan.example.CourseBookingLab.repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepositories.CourseRepository;
import com.codeclan.example.CourseBookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingLabApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

//	Get all courses with a given rating

	@Test
	public void findAllCoursesByRating(){
		List<Course> found = courseRepository.findByRating(5);
		assertEquals("Stealing for Hairdressers", found.get(0).getName());
		assertEquals(2, found.size());
	}

//	Get all customers for a given course
	@Test
	public void findByCourseId(){
		List<Customer> found = customerRepository.findByBookingsCourseId(2L);
		assertEquals("Juan Miguel", found.get(0).getName());
		assertEquals(1, found.size());
	}

//	Get all courses for a given customer
	@Test
	public void findCoursesByBookingsCustomerId(){
		List<Course> found = courseRepository.findCoursesByBookingsCustomerId(1L);
		assertEquals(4, found.size());
	}

//	Get all bookings for a given date
	@Test
	public void findBookingsByDate(){
		List<Booking> found = bookingRepository.findByDate("14-05-20");
		assertEquals(2, found.size());
	}

	// Get all customers in a given town for a given course
	@Test
	public void findCustomersBookingsTown(){
	List<Customer> found = customerRepository.findByBookingsCourseIdAndTownIgnoreCase(1L, "Edinburgh");
	assertEquals(1, found.size());
	assertEquals("Kurt Swift", found.get(0).getName());
	}

	// Get all customers over a certain age in a given town for a given course
	@Test
	public void findCustomersByAgeGreaterThanAndTownAndCourseId(){
		List<Customer> found = customerRepository.findCustomersByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(28, "edinburgh", 3L);
		assertEquals(1, found.size());
		assertEquals("Kurt Swift", found.get(0).getName());
	}

	@Test
	public void canCustomApiUrlFilterByAge(){
		List<Customer> found = customerRepository.findCustomersByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(30, "edinburgh", 3L);
		assertEquals(1, found.size());
	}

}
