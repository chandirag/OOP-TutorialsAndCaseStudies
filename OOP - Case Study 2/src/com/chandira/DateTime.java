package com.chandira;

public class DateTime {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;

    public DateTime() {}

    public DateTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateTime(int day, int month, int year, int hour, int min) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getDateTime() {
        String date = "";
        String day = String.format("%02d", this.day);
        String month = String.format("%02d", this.month);
        String year = String.format("%04d", this.year);
        date = day + "/" + month + "/" + year;
        String time = hour + min + "h";
        return date + " " + time;
    }
}
