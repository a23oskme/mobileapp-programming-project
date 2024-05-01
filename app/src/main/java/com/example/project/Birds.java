package com.example.project;

public class Birds {

    private String name;
    private String location;
    private int weight;

    // default constructor
    public Birds() {
        name = "Saknar namn";
        location = "Saknar plats";
        weight = -1;
    }
    public Birds(String n, String l, int h) {
        name = n;
        location = l;
        weight = h;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", height=" + weight +
                '}';
    }

    /*public void setName(String n) {
        name = n;
    }*/

    public String getName() {
        return name;
    }

    /*public void setLocation(String l) {
        location = l;
    }*/

    public String getLocation() {
        return location;
    }

    /*public void setHeight(int h) {
        height = h;
    }*/

    public String getHeight() {
        return ""+weight;
    }

}

