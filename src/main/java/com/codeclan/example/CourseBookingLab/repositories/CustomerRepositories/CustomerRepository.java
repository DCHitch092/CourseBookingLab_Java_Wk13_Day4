package com.codeclan.example.CourseBookingLab.repositories.CustomerRepositories;

import com.codeclan.example.CourseBookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseId(Long id);
    List<Customer> findByBookingsCourseIdAndTownIgnoreCase(long courseId, String town);
    List<Customer> findCustomersByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(int i, String edinburgh, long l);
}
