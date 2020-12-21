package com.example.erp.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Course_Prerequisite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Courses courses;


    public Course_Prerequisite() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

}
