package com.reza.student_result.repositories;

import com.reza.student_result.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, JpaSpecificationExecutor<Course> {
    @Query("SELECT c FROM Course c WHERE " +
            "(c.courseCode = :courseCode) AND (c.recordStatus <> 'DELETED')"
    )
    Optional<Course> findByCourseCode(String courseCode);
}