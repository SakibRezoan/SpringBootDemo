package com.reza.student_result.services;

import com.reza.student_result.entities.Course;
import com.reza.student_result.repositories.CourseRepository;
import com.reza.student_result.requests.CourseRequest;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public abstract class CourseService {
    protected final CourseRepository courseRepository;
    protected abstract Course save (CourseRequest courseRequest);
    protected abstract Optional<Course> findByCourseCode(String courseCode);
    protected abstract Optional<Course> findCourseById(Long id);
    protected abstract Course findCourseByIdNotOptional (Long id);
    protected abstract Optional <Course> findById(Long id);
}
