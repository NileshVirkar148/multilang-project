package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Maven!");
        try {
            ObjectMapper mapper = new ObjectMapper();
            System.out.println("Jackson version: " + mapper.getClass().getPackage().getImplementationVersion());
            System.out.println("text");         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
