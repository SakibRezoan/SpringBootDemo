package com.reza.student_result.repositories;

import com.reza.student_result.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Optional<Subject> findBySubjectName(String subjectName);

    Optional<Subject> findBySubjectNameBn(String subjectNameBn);
}
