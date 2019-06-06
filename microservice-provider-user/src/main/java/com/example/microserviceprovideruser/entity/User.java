package com.example.microserviceprovideruser.entity;


public class User {


    private Integer id;

    private String username;

    private String name;

    private Integer age;

    public User(Integer id, String username, String name, Integer age) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
