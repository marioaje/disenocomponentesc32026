
package org.example.apibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication

@ComponentScan(basePackages = {
        "org.example.apibackend",
        "controller",
        "service"
})

@EnableJpaRepositories(basePackages = {
        "repository"
})

@EntityScan(basePackages = {
        "model"
})

public class ApiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiBackendApplication.class, args);
    }
}
