package biz.robous.krja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class KrjaOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrjaOpenApiApplication.class, args);
    }

}
