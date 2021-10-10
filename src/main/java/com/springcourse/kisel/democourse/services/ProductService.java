package com.springcourse.kisel.democourse.services;

import com.springcourse.kisel.democourse.dto.ResponseData;
import com.springcourse.kisel.democourse.model.entities.Product;
import com.springcourse.kisel.democourse.model.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 07/10/2021;
 * Time : 12:45;
 **/

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public ResponseData<Product> findOne(Long id) {
        Optional<Product> product = productRepo.findById(id);
        ResponseData<Product> responseData = new ResponseData<>();
        if(!product.isPresent()) {
            responseData.setStatus(false);
            return responseData;
        }
        responseData.setStatus(true);
        responseData.setPayload(product.get());
        return responseData;
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }

}
