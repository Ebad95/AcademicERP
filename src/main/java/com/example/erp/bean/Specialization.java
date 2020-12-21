package com.example.erp.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer specialization_id;
    @Column(nullable = false, unique = true)
    private String code;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private Integer year;

    public Specialization(String code, String name, String description, Integer year) {

        this.code = code;
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public Specialization() {

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Integer getSpecialization_id() {
        return specialization_id;
    }

    public void setSpecialization_id(Integer specialization_id) {
        this.specialization_id = specialization_id;
    }
}
