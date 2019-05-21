package com.qzs.sboot.api;

import com.qzs.sboot.service.CityService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String login(String name) {
//        cityMapper.findByState("CA")
//        HttpMessageConverter d;
        System.out.println("hello " + name);


        return "hello " + name;
    }

//
}
