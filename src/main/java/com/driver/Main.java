package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnlyObj = new RWOnly();
        rwOnlyObj.setName("Dipti");


        String retrievedName = rwOnlyObj.getName();
        System.out.println("Name: " + retrievedName);
    }
  
}