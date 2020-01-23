package com.codeclan.example.CourseBookingLab;

import com.codeclan.example.CourseBookingLab.repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepositories.CourseRepository;
import com.codeclan.example.CourseBookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
