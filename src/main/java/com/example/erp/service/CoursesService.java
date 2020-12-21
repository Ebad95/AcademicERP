package com.example.erp.service;

import com.example.erp.bean.Courses;
import com.example.erp.dao.impl.CoursesDAOImpl;

import java.util.List;

public class CoursesService {
    public void addCourse(String course_code,String name, String description, Integer year, String term, Integer credits, Integer capacity, String faculty) {
        Courses course = new Courses(course_code, name, description, year, term, credits, capacity, faculty);
        new CoursesDAOImpl().addCourse(course);
    }
    public List<Courses> getCourse() {
        return new CoursesDAOImpl().getCourse();
    }
}
