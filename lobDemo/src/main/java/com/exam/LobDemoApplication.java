package com.exam;

import java.io.FileInputStream;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.exam.model.Product;
import com.exam.service.ProductService;
import com.exam.service.ProductServiceImpl;

@SpringBootApplication
public class LobDemoApplication {

	public static void main(String[] args) throws Exception {
	ConfigurableApplicationContext context=
			SpringApplication.run(LobDemoApplication.class, args);
//phone1.png,samsung23.jpg
		FileInputStream file=new FileInputStream("D:/imageProject/phone.png");
		byte[] img=new byte[file.available()];
		file.read(img);
		String input="This is good smart phone .It is good for live sreaming,game playing.";
		char[] desc=input.toCharArray();
		ProductService ps=context.getBean(ProductServiceImpl.class);
		Product p=new Product();
		p.setPId(15);
		p.setPBrand("samsung1");
		p.setPDesc(desc);
		p.setPImg(img);
		p.setPPrise(4555.89);
		p.setPName("phone1");
		ps.saveProductData(p);
		file.close();
		//ps.showData(12);
		

	}

}
