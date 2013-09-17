package birthday;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Wisher {

    public static void main(String[] args) {
        SpringApplication.run(Wisher.class, args);
    }
}
