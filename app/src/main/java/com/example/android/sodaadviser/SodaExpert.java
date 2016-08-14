package com.example.android.sodaadviser;

/**
 * Created by Omar on 8/14/2016.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SodaExpert {

    Map colorToSoda;

    public SodaExpert(){
        colorToSoda = new TreeMap();
        colorToSoda.put("light","7up");
        colorToSoda.put("amber","Dr Pepper");
        colorToSoda.put("brown","Coca Cola Rasberry");
        colorToSoda.put("dark","Coca Cola");
    }

    String getBrands(String color) {
        List<String> brands = new ArrayList<>();
//        if (color.equals("amber")) {
//            brands.add("");
//            brands.add("Red Moose");
//        } else {
//            brands.add("Jail Pale Ale");
//            brands.add("Gout Stout");
//        }
        return (String) colorToSoda.get(color);
    }
}