package com.example.demo.student;

import java.time.LocalDate;

public class Student
{
    private  Long Id;
    private String Name;
    private String Email;
    private LocalDate DOB;
    private Integer Age;



    public Student(){

    }

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate DOB,
                   Integer age) {
        Id = id;
        Name = name;
        Email = email;
        this.DOB = DOB;
        Age = age;
    }

    public Student(String name,
                   String email,
                   LocalDate DOB,
                   Integer age) {
        Name = name;
        Email = email;
        this.DOB = DOB;
        Age = age;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", DOB=" + DOB +
                ", Age=" + Age +
                '}';
    }
}
