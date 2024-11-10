package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return  args -> {
            Student Chris = new Student(
                    "Chris",
                    "chris@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 1)
            );
            Student Jude = new Student(
                    "Jude",
                    "jude@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 1)
            );

            studentRepository.saveAll(
                    List.of(Chris,Jude)
            );
        };
    }
}
