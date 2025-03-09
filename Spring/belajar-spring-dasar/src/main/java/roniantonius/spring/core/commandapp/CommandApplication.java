package roniantonius.spring.core.commandapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // anotasi ini membuat kita mengakses file pada folder yang sama melaui ComponentScan
public class CommandApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class);
    }
}