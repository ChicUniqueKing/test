package com.chic.dockerspringbootdemo.pojo;


public class Product {
	
	private int id;
	
	private String name ;
	
	private Integer num;
	
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(int id, String name, Integer num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getNum() {
		return num;
	}



	public void setNum(Integer num) {
		this.num = num;
	}
	
	

}
