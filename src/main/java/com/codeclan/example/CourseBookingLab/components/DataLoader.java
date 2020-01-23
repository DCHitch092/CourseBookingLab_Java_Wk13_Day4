package com.codeclan.example.CourseBookingLab.components;

import com.codeclan.example.CourseBookingLab.models.Booking;
import com.codeclan.example.CourseBookingLab.models.Course;
import com.codeclan.example.CourseBookingLab.models.Customer;
import com.codeclan.example.CourseBookingLab.repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepositories.CourseRepository;
import com.codeclan.example.CourseBookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public void DataLoader(){}

    public void run(ApplicationArguments args) throws Exception {
        Course course1 = new Course("Stealing for Hairdressers", "Edinburgh", 5);
        Course course2 = new Course("Hairdressing for Thieves", "Glasgow", 2);
        Course course3 = new Course("Fringe work and Pickpocketing", "Edinburgh", 4);
        Course course4 = new Course("Stealing Looks With Hot Hair, and skeleton keys with Euguene", "Inverness", 5);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);

        Customer customer1 = new Customer("Juan Miguel", "Inverness", 69);
        Customer customer2 = new Customer("Eustaquio Carlos", "Edinburgh", 17);
        Customer customer3 = new Customer("Brupert Thebear", "Glasgow", 40);
        Customer customer4 = new Customer("Kurt Swift", "Edinburgh", 29);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);

        Booking booking1 = new Booking("07-08-20", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("14-05-20", course2, customer1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("11-12-20", course1, customer4);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("14-05-20", course1, customer3);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("07-10-20", course3, customer1);
        bookingRepository.save(booking1);

        Booking booking6 = new Booking("14-03-20", course4, customer1);
        bookingRepository.save(booking2);

        Booking booking7 = new Booking("11-11-20", course3, customer2);
        bookingRepository.save(booking3);

        Booking booking8 = new Booking("14-07-20", course4, customer3);
        bookingRepository.save(booking4);

    }






}
