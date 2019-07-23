package com.chic.dockerspringbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chic.dockerspringbootdemo.pojo.Product;
import com.chic.dockerspringbootdemo.service.InsertProduct;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DockerSpringbootDemoApplicationTests {
	
	@Autowired
	private  InsertProduct  insertProduct;

	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void  testRedis() {
		Product product = new Product();
		product.setName("苹果");
		product.setNum(8888);
		insertProduct.InsertProduct(product);
	}

}
