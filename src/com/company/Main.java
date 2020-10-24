package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<String> AL1 = new ArrayList<String>();
    AL1.add("Pizza");
    AL1.add("Mac and Chesse");
    AL1.add("Taco");
    AL1.add("Popcorn");
    AL1.add("Salad");
    System.out.println(AL1);
    List<String> AL2 = new ArrayList<String>();
    AL2.add("Apple");
    AL2.add("Sony");
    AL2.add("Microsoft");
    AL2.add("Spotify");
    AL2.add("Windows");
    AL1.addAll(1, AL2);
    System.out.println(AL1);
    AL1.remove(1);
    System.out.println(AL1);
    AL1.get(3);
    System.out.println(AL1.get(3));
    AL1.set(0, "Eggs");
    System.out.println(AL1);
    }
}
