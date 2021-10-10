package com.springcourse.kisel.democourse.model.repository;

import com.springcourse.kisel.democourse.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 07/10/2021;
 * Time : 12:45;
 **/

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}
