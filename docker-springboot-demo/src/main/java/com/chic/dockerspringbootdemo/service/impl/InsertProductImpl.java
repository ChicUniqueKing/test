package com.chic.dockerspringbootdemo.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.chic.dockerspringbootdemo.pojo.Product;
import com.chic.dockerspringbootdemo.service.InsertProduct;
import com.chic.dockerspringbootdemo.util.RedisServiceUtil;


@Service
public class InsertProductImpl implements InsertProduct{
	
	private static final String MS_KEY ="MS_key";
	
/*	@Autowired
	private RedisTemplate<String, String> redisTemplate;*/
	@Autowired
	private RedisServiceUtil redisServiceUtil;
	
	@Override
	public void InsertProduct(Product product) {
		redisServiceUtil.setRedis(MS_KEY, "123", 2000, TimeUnit.MILLISECONDS);
		String rs = redisServiceUtil.getValue(MS_KEY);
		System.out.println("---------------"+rs);
	}

	

}
