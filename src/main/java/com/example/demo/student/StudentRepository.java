package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    //bear in mind that this is jpql and not straight SQL
    @Query("Select s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
