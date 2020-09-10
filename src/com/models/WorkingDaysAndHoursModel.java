/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author Acer
 */
public class WorkingDaysAndHoursModel {
    
    private int id;
    private int num_of_working_days;
    private String working_days;
    private String work_time_per_day;
    private String time_slot;
    private String slot_date;
    private String slot_description;
    private String log_date;
    

//    public WorkingDaysAndHoursModel(int id, int num_of_working_days, String working_days, int work_time_per_day, String time_slot) {
//        this.id = id;
//        this.num_of_working_days = num_of_working_days;
//        this.working_days = working_days;
//        this.work_time_per_day = work_time_per_day;
//        this.time_slot = time_slot;
//    }

    public WorkingDaysAndHoursModel(int num_of_working_days) {
        this.num_of_working_days = num_of_working_days;
    }

    public String getSlot_date() {
        return slot_date;
    }

    public void setSlot_date(String slot_date) {
        this.slot_date = slot_date;
    }

    public String getSlot_description() {
        return slot_description;
    }

    public void setSlot_description(String slot_description) {
        this.slot_description = slot_description;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_of_working_days() {
        return num_of_working_days;
    }

    public void setNum_of_working_days(int num_of_working_days) {
        this.num_of_working_days = num_of_working_days;
    }

    public String getWorking_days() {
        return working_days;
    }

    public void setWorking_days(String working_days) {
        this.working_days = working_days;
    }

    public String getWork_time_per_day() {
        return work_time_per_day;
    }

    public void setWork_time_per_day(String work_time_per_day) {
        this.work_time_per_day = work_time_per_day;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }

    public String getLog_date() {
        return log_date;
    }

    public void setLog_date(String log_date) {
        this.log_date = log_date;
    }
    
    
    
    
    
}
