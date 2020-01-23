package com.codeclan.example.CourseBookingLab;

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
//	Get all bookings for a given date

}
