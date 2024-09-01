package org.java.versions.java08.stream_api;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

class Main {

	static class Product {
		int id;
		String name;
		float price;

		public Product(int id, String name, float price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
	}
	// This package consists of classes, interfaces and enum to allows
	// functional-style operations on the elements.
	// You can use stream by importing java.util.stream package.

	static void example01() {

		List<Product> productsList = new ArrayList<>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList2 = productsList.stream() //
				.filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(toList()); // collecting as list

		// More precise code
		float totalPrice2 = productsList.stream() //
				.map(product -> product.price) //
				.reduce(0.0f, Float::sum); // accumulating price, by referring method of Float class

		out.println(productPriceList2);
		out.println(totalPrice2);
	}
}
