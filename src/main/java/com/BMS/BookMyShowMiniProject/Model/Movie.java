package com.BMS.BookMyShowMiniProject.Model;

public class Movie {
    private String name;
    private int duration;
    private double rating;
    private String dimension;
    private int price;

    public Movie(String name, int duration, double rating, String dimension, int price, boolean d) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.dimension = dimension;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
