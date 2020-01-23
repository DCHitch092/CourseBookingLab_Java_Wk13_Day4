package com.codeclan.example.CourseBookingLab.repositories.BookingRepositories;


import com.codeclan.example.CourseBookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
