/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author ESHAN
 */
public class Lecturer {
    
    private int lectureId;
    private String lecturername;
    private String employeeId;
    private String faculty;
    private String department;
    private String center;
    private String building;
    private String level;
    private String rank;

    public Lecturer(int lectureId, String lecturername, String employeeId, String faculty, String department, String center, String building, String level, String rank) {
        this.lectureId = lectureId;
        this.lecturername = lecturername;
        this.employeeId = employeeId;
        this.faculty = faculty;
        this.department = department;
        this.center = center;
        this.building = building;
        this.level = level;
        this.rank = rank;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getLecturername() {
        return lecturername;
    }

    public void setLecturername(String lecturername) {
        this.lecturername = lecturername;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    

    
    
    
    
    
}
