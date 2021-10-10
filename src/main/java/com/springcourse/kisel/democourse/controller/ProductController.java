package com.springcourse.kisel.democourse.controller;

import com.springcourse.kisel.democourse.dto.ResponseData;
import com.springcourse.kisel.democourse.model.entities.Product;
import com.springcourse.kisel.democourse.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 07/10/2021;
 * Time : 12:45;
 **/

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ResponseData<Product>> create(@Valid @RequestBody Product product, Errors errors) {
        ResponseData<Product> responseData = new ResponseData<>();
        if(errors.hasErrors()) {
            for (ObjectError error: errors.getAllErrors()) {
                responseData.getMessage().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }

        responseData.setStatus(true);
        responseData.setPayload(productService.save(product));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping("/{id}")
    public ResponseData<Product> findOne(@PathVariable("id") Long id) {
        return productService.findOne(id);
    }

    @GetMapping
    public ResponseEntity<ResponseData<Iterable<Product>>> findAll() {
        ResponseData<Iterable<Product>> responseData = new ResponseData<>();
        responseData.setStatus(true);
        responseData.setPayload(productService.findAll());
        return ResponseEntity.ok(responseData);
    }

    @PutMapping
    public ResponseEntity<ResponseData<Product>> update(@Valid @RequestBody Product product, Errors errors) {
        ResponseData<Product> responseData = new ResponseData<>();
        if(errors.hasErrors()) {
            for (ObjectError error: errors.getAllErrors()) {
                responseData.getMessage().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }

        responseData.setStatus(true);
        responseData.setPayload(productService.save(product));
        return ResponseEntity.ok(responseData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable("id") Long id) {
        ResponseData<Product> product = productService.findOne(id);
        HashMap<Object, Object> map = new HashMap<>();
        ResponseEntity responseEntity;
        if(product.isStatus() == false) {
            map.put("code", "05");
            map.put("status", product.isStatus());
            map.put("msg", "Id product dengan nomor "+ id +" tidak tersedia!");
            responseEntity = new ResponseEntity(map, HttpStatus.NOT_FOUND);
            return responseEntity;
        }
        productService.delete(id);
        map.put("code", "00");
        map.put("status", product.isStatus());
        map.put("msg", "Id product dengan nomor " + id + " berhasil dihapus!");
        responseEntity = new ResponseEntity(map, HttpStatus.OK);
        return responseEntity;
    }


}
