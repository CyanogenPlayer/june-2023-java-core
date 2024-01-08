package com.cyan.demo;

public class BuilderDemo {
    public static void main(String[] args) {
        Product product = Product.builder()
                .name("name")
                .price(1000)
                .description("lalala")
                .build();

        System.out.println(product);
    }
}
