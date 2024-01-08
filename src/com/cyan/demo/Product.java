package com.cyan.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {
    private String name;
    private double price;
    private String description;
}
