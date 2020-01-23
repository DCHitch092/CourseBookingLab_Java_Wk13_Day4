package com.codeclan.example.CourseBookingLab.controllers;

import com.codeclan.example.CourseBookingLab.models.Customer;
import com.codeclan.example.CourseBookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/overAgeTownCourse/age/{age}/town/{town}/courseId/{courseId}")
    public List<Customer> getAllCustomersOverAgeByTownAndCourse( @PathVariable int age,  @PathVariable String town,  @PathVariable Long courseId){
       return customerRepository.findCustomersByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(age, town, courseId);
    }

}
