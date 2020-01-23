package com.codeclan.example.CourseBookingLab.projections;

import com.codeclan.example.CourseBookingLab.models.Booking;
import com.codeclan.example.CourseBookingLab.models.Course;
import com.codeclan.example.CourseBookingLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "Banana", types = Booking.class)
public interface EmbedCourseAndCustomer {
    String getDate();
    Customer getCustomer();
    Course getCourse();
}
