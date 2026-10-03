package uk.ac.westminster.products_api2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

// 1. Tell Spring this class handles web requests
@RestController
public class HelloController {

    // 2. Map the "/hello" URL path to this specific method
    @GetMapping("/hello")
    public String sayHello() {
        // 3. The raw data to return to the client
        return "Hello, Spring Boot is running live!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running - "+ LocalDate.now().toString();
    }
}