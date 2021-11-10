package com.springcourse.kisel.democourse.model.repository;

import com.springcourse.kisel.democourse.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 10/11/2021;
 * Time : 14:23;
 **/

public interface StudentRepo extends JpaRepository<Student, Long> {

//    @Query("SELECT s FROM Student s WHERE s.email = ?1");
    Optional<Student> findStudentByEmail(String email);
}
