package co.newthings.tlazohtlaloni.aztecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AztecsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AztecsApplication.class, args);
    }
}
