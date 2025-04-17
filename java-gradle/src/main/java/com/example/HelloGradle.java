package com.example;

import org.apache.commons.collections.map.HashedMap;

public class HelloGradle {
    public static void main(String[] args) {
        System.out.println("Hello, Gradle!");
        HashedMap map = new HashedMap();
        map.put("key", "value");
        System.out.println("Map: " + map);
    }
}