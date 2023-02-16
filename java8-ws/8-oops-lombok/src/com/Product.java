package com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String decription;
	private boolean inStock;
}
