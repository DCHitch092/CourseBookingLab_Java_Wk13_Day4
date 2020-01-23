package com.codeclan.example.CourseBookingLab.repositories.CourseRepositories;

import com.codeclan.example.CourseBookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {
}