package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Studname {
     @GetMapping("/")
        public String getName() {
            String studentName="Monisha";
            return "Hii"+ studentName;
}
}