package com.example.erp.dao;

import com.example.erp.bean.Courses;

import java.util.List;

public interface CoursesDAO {
    public abstract void addCourse(Courses course);
    public abstract List<Courses> getCourse();
}
