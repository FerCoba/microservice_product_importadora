package com.microservice.product.importadora.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.product.importadora.entities.Product;
import com.microservice.product.importadora.response.Response;
import com.microservice.product.importadora.service.ProductServices;
import com.microservice.product.importadora.util.ProductBuilder;

@RestController
@RequestMapping(path = "/product", produces = "application/json")
public class ProductController {

	@Autowired
	ProductServices productService;

	@GetMapping(value = "/obtainAllProducts")
	public ResponseEntity<Response> obtainInformationOfAllUsers() {
		List<Product> users = new ArrayList<>();
		try {
			users = productService.test();
		} catch (Exception exceptionObtainInformationOfAllUsers) {
			throw exceptionObtainInformationOfAllUsers;
		}
		return new ResponseEntity<>(new Response(String.valueOf(HttpStatus.OK), null, users), HttpStatus.OK);
	}

	@GetMapping(value = "/product/{productId}/information")
	public ResponseEntity<Response> obtainProductInformationByProductId(@PathVariable("productId") int productId) {

		Product productResponse = new Product();

		try {
			productResponse = productService.test1(productId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(new Response(String.valueOf(HttpStatus.OK), null, productResponse), HttpStatus.OK);
	}
	
	@PostMapping(value = "/insertNewProduct")
	public ResponseEntity<Response> insertNewProduct(@RequestBody ProductBuilder product) {
		
		return null;
	}

}
