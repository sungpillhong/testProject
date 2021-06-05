package com.example.testproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

    @GetMapping("/delay/{sec}")
    public String delay(@PathVariable String sec) throws Exception{
        Thread.sleep(Integer.parseInt(sec) * 1000);
        return "DONE!!!";
    }
}
