package com.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Product;
import com.exam.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	public void saveProductData(Product product)
	{
		productRepository.save(product);
		System.out.println("successfull");
	}
	@Override
	public void showData(Integer id) {
		
		Optional<Product> p=productRepository.findById(id);
		System.out.println(p.get().getPImg());
	}

}
