//package com.example.testproject;
//
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StopWatch;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//@Slf4j
//@RequiredArgsConstructor
//public class RestTemplateTest implements ApplicationRunner {
//
//    private final RestTemplateBuilder restTemplateBuilder;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        RestTemplate restTemplate = restTemplateBuilder.build();
//
//        StopWatch stopWatch = new StopWatch();
//        log.info("RestTemplate Start !!");
//        stopWatch.start();
//
//        String result5sec = restTemplate.getForObject("http://localhost:8080/delay/5", String.class);
//        log.info("RestTemplate result5sec : {}", result5sec);
//
//        String result10sec = restTemplate.getForObject("http://localhost:8080/delay/10", String.class);
//        log.info("RestTemplate result10sec : {}", result10sec);
//
//        stopWatch.stop();
//        log.info("RestTemplate END Time : {}", stopWatch.getTotalTimeSeconds());
//    }
//}
