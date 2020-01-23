package com.codeclan.example.CourseBookingLab.projections;

import com.codeclan.example.CourseBookingLab.models.Booking;
import com.codeclan.example.CourseBookingLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="Banana2", types = Booking.class)
public interface EmbedCustomer {
    String getDate();
    Customer getCustomer();
}
