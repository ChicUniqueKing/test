package com.chic.dockerspringbootdemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.chic.dockerspringbootdemo.pojo.Product;

@Mapper
public interface ProductMapper {
	
	@Insert("Insert into product_stock (name,num) values (#{name},#{num})")
	public void insertIntoProduct(Product product);

}
