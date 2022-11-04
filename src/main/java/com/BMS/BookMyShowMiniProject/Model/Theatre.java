package com.BMS.BookMyShowMiniProject.Model;

import java.util.*;

public class Theatre {
    String name;
    String location;
    int no_of_screen;
    List<Movie> MovieNames;
    List<Screen> ScreenNames;

    public Theatre(String name, String location, int no_of_screen) {
        this.name = name;
        this.location = location;
        this.no_of_screen = no_of_screen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNo_of_screen() {
        return no_of_screen;
    }

    public void setNo_of_screen(int no_of_screen) {
        this.no_of_screen = no_of_screen;
    }

    public List<Movie> getMovieNames() {
        return MovieNames;
    }

    public void setMovieNames(List<Movie> movieNames) {
        MovieNames = movieNames;
    }

    public List<Screen> getScreenNames() {
        return ScreenNames;
    }

    public void setScreenNames(List<Screen> screenNames) {
        ScreenNames = screenNames;
    }
}
