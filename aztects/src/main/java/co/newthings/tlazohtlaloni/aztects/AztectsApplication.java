package co.newthings.tlazohtlaloni.aztects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableEurekaClient

@SpringBootApplication
public class AztectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AztectsApplication.class, args);
    }
}
