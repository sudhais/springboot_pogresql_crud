package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

           Student james = new Student(
                    "james",
                    "james@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,12)
            );

           Student mariam = new Student(
                   "mariam",
                   "mariam@gmail.com",
                   LocalDate.of(2001, Month.JANUARY,12)
           );

           repository.saveAll(List.of(james,mariam));
        };
    }
}
