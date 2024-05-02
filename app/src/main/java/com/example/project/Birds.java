package com.example.project;

public class Birds {

    private String name;
    private String location;
    private int weight;
    private String latin;
    private String wikiLink;
    // default constructor
    public Birds() {
        name = "Saknar namn";
        location = "Saknar plats";
        weight = -1;
        latin = "Saknar latinskt namn";
        wikiLink = "Länk saknas";
    }
    public Birds(String n, String l, int h, String m, String w) {
        name = n;
        location = l;
        weight = h;
        latin = m;
        wikiLink = w;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", weight=" + weight + '\'' +
                ", latin='" + latin + '\'' +
                ", link='" + wikiLink +
                '}';
    }

    /*public void setName(String n) {
        name = n;
    }*/

    public String getName() {
        return String.format("%-20s %-30s", "Namn:", name);
    }

    /*public void setLocation(String l) {
        location = l;
    }*/

    public String getLocation() {
        return String.format("%-20s %-30s", "Finns i Sverige:", location);
    }

    /*public void setHeight(int h) {
        height = h;
    }*/

    public String getWeight() {
        return String.format("%-20s %-30s", "Vikt (g):", weight);
    }


    public String getLatin() {
        return String.format("%-20s %-30s", "Vetenskapligt namn:" , latin);
    }
    public String getWikiLink() {
        return "Källa: " + wikiLink;
    }

}

