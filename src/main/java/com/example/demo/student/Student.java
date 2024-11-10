package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student
{
    @jakarta.persistence.Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private  Long id;
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;



    public Student(){

    }

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate DOB) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = DOB;
    }

    public Student(String name,
                   String email,
                   LocalDate DOB) {
        this.name = name;
        this.email = email;
        this.dob = DOB;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOB() {
        return this.dob;
    }

    public void setDOB(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", DOB=" + dob +
                ", Age=" + age +
                '}';
    }
}
