package com.example.my_backend_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class MyBackendAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBackendAppApplication.class, args);
    }
	// @Bean
    // public WebMvcConfigurer corsConfigurer() {
    //     return new WebMvcConfigurer() {
    //         @Override
    //         public void addCorsMappings(CorsRegistry registry) {
    //             registry.addMapping("/**")
    //                     .allowedOrigins("https://my-express-frontend-app-c2ccbyf0c4dzhcda.westus2-01.azurewebsites.net") // 許可するオリジンを指定
    //                     .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可するHTTPメソッドを指定
    //                     .allowedHeaders("*"); // 許可するヘッダーを指定
    //         }
    //     };
    // }
}

@RestController
class MyController {

    @GetMapping("/")
    public String home() {
        return "こんにちは";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello Azure App Service!";
    }
}
