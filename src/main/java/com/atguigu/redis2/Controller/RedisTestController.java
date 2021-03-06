package com.atguigu.redis2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis(){
        redisTemplate.opsForValue().set("name","lacy");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }

    public static void main(String[] args) {
        System.out.println("qqqqqqqqqqqq ");
        System.out.println("hello git");
        System.out.println("hello git1");
        System.out.println("master test");
        System.out.println("hot-fix test");
    }
}
