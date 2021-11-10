package com.springcourse.kisel.democourse.config;

import com.springcourse.kisel.democourse.model.entities.Student;
import com.springcourse.kisel.democourse.model.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 10/11/2021;
 * Time : 14:55;
 **/

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
//        return args -> {
//            Student anisa = new Student(
//                   "Anisa",
//                   "anisa@gmail.com",
//                   LocalDate.of(1995, Month.AUGUST, 5)
//           );
//
//            Student tiara = new Student(
//                    "Tiara",
//                    "tiara@gmail.com",
//                    LocalDate.of(1997, Month.JANUARY, 11)
//            );
//
//            studentRepo.saveAll(Arrays.asList(anisa, tiara));
//        };
//    }
}
