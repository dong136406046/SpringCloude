package com.example.microserviceconsumermovie.controller;

import com.example.microserviceconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate testTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Integer id) {
        // 这里用到了RestTemplate的占位符能力
        User user = this.testTemplate.getForObject("http://localhost:8002/users/findById?id={id}", User.class, id);
        // ...电影微服务的业务...
        return user;
    }
}
