package com.microservice.product.importadora.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.product.importadora.entities.Product;
import com.microservice.product.importadora.repositories.ProductRepository;
import com.microservice.product.importadora.util.ProductBuilder;

@Service
public class ProductServices {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> test() {
		List<Product> p = new ArrayList<>();
		try {
			 p = productRepository.findAll();
			 System.out.println( " p " + p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public Product test1(int productId) {
		Product product = new Product();
		
		try {
			product = productRepository.obtainUserAndPassword(productId);
			System.out.println( " product " + product.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
	public int insertProduct(ProductBuilder product) {
		
		int result = 0;
		
		try {
			//productRepository.saveAll(product);
		}catch (Exception e) {
			result = 1;
		}
		return result;
	}

}
