package com.BMS.BookMyShowMiniProject.Model;

import java.util.HashMap;

public class Screen {
    String name;
    int capacity;
    HashMap<String,String> hm;

    public Screen(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Screen(String name, int capacity, HashMap<String, String> hm) {
        this.name = name;
        this.capacity = capacity;
        this.hm = hm;
    }

    public HashMap<String, String> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, String> hm) {
        this.hm = hm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
