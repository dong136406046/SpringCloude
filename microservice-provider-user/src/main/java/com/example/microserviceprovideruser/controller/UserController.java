package com.example.microserviceprovideruser.controller;

import com.example.microserviceprovideruser.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequestMapping("/users")
@RestController
public class UserController {



    @RequestMapping("/findById")
    public User findById(Integer id) {
        ArrayList<User> userList = new ArrayList<User>();
        User user = null;

        // 线程睡眠20秒
//        try{
//
//            Thread.sleep(20000L);
//        }catch(InterruptedException e){e.printStackTrace();}
        if(id == 1){
            userList.add(new User(1, "account1", "张三", 20));
            user =  new User(1, "account1", "张三", 20);
        }else if(id == 2){
            userList.add(new User(2, "account2", "李四", 28));
            user = new User(2, "account2", "李四", 28);
        }else if(id == 3){
            userList.add(new User(3, "account3", "王五", 32));
            user = new User(3, "account3", "王五", 32);
        }

        return user;
    }


}
