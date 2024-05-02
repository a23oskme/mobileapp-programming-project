package com.example.project;

public class Birds {

    private String name;
    private String location;
    private int weight;
    private String latin;
    // default constructor
    public Birds() {
        name = "Saknar namn";
        location = "Saknar plats";
        weight = -1;
        latin = "Saknar latinskt namn";
    }
    public Birds(String n, String l, int h, String m) {
        name = n;
        location = l;
        weight = h;
        latin = m;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", weight=" + weight + '\'' +
                ", latin='" + latin +
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

    public String getWeight() {
        return ""+weight;
    }


    public String getLatin() {
        return latin;
    }

}

