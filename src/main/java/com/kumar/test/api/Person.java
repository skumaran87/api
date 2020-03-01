package com.kumar.test.api;

public class Person {

    private String id;
    private String name;
    private String age;
    private String location;
    private String country;

    public Person() {
    }

    public Person(String id, String name, String age, String location, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
