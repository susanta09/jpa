package com.exam.service;

import org.springframework.stereotype.Service;

import com.exam.model.Product;

@Service
public interface ProductService {
	public void saveProductData(Product product);
	public void showData(Integer id);

}
