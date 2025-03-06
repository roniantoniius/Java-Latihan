package com.example.helloworld.hello_world;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// ini adalah anotasi
@RestController // controller artinya kode bagian ini sebagia kontrol penting, dan RestController artinya akan menangani request yagn masuk
@SpringBootApplication // ini adalah meta anotasi, jadi intinya untuk auto konfigurasi bahwa proyek ini adlaah spring boot web
public class HelloWorldApplication {

	@RequestMapping("/") // anotasi yang nandain kalau HTTP request dengan "/" path harus diimplementasikan dari method home
	public String home() {
		return "Hello World!";
	}

	public static void main(String[] args){
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
