package com.example.erp.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Courses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;
    @Column(nullable = false, unique = true)
    private String course_code;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false)
    private String term;
    @Column(nullable = false)
    private Integer credits;
    @Column(nullable = false)
    private Integer capacity;
    @Column(nullable = false)
    private String faculty;




    public Courses() {

    }
    public Courses(String course_code, String name, String description, Integer year, String term, Integer credits, Integer capacity, String faculty) {

        this.course_code = course_code;
        this.name = name;
        this.description = description;
        this.year = year;
        this.term = term;
        this.credits = credits;
        this.capacity = capacity;
        this.faculty = faculty;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
