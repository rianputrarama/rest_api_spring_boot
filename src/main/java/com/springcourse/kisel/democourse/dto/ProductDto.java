package com.springcourse.kisel.democourse.dto;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 07/10/2021;
 * Time : 12:45;
 **/

public class ProductDto {

    private String product_name;
    private String product_desc;
    private double product_price;

    public ProductDto(String product_name, String product_desc, double product_price) {
        this.product_name = product_name;
        this.product_desc = product_desc;
        this.product_price = product_price;
    }

    public ProductDto() {
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
}
