package com.codeclan.example.CourseBookingLab.controllers;

import com.codeclan.example.CourseBookingLab.repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {


    @Autowired
    CourseRepository courseRepository;

}
