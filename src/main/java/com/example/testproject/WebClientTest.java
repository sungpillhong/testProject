package com.example.testproject;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@Slf4j
@RequiredArgsConstructor
public class WebClientTest implements ApplicationRunner {

    private final WebClient.Builder webClientBuilder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        WebClient webClient = webClientBuilder.build();

        StopWatch stopWatch = new StopWatch();
        log.info("WebClient Start !!!");
        stopWatch.start();

        Mono<String> result5sec = webClient.get()
                .uri("http://localhost:8080/delay/5")
                .retrieve()
                .bodyToMono(String.class);

        result5sec.subscribe(result -> {
            log.info("WebClient result5Sec: {}", result);
            if(stopWatch.isRunning()) {
                stopWatch.stop();
            }

            log.info("WebClient result(5Sec) : {}", stopWatch.getTotalTimeSeconds());
            stopWatch.start();
        });

        Mono<String> result10sec = webClient.get()
                .uri("http://localhost:8080/delay/10")
                .retrieve()
                .bodyToMono(String.class);

        result10sec.subscribe(result -> {
            log.info("WebClient result10sec : {}", result);
            if(stopWatch.isRunning()){
                stopWatch.stop();
            }
            log.info("WebClient result(10sec) : {} ", stopWatch.getTotalTimeSeconds());
            stopWatch.start();
        });

    }
}
