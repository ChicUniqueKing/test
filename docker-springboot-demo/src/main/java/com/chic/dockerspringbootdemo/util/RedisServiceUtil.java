package com.chic.dockerspringbootdemo.util;

import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;

import redis.clients.jedis.JedisCommands;



public class RedisServiceUtil {
	
	
	private RedisTemplate<Object, Object> redisTemplate;
	
	public RedisServiceUtil(RedisTemplate<Object, Object> redisTemplate) {
		this.redisTemplate=redisTemplate;
	}
	
	
	/**
	 *  设置值
	 * @param key
	 * @param obj
	 * @param times
	 */
	public boolean setRedis(String key,String value,long times,TimeUnit unit) {
		try {
		String result = redisTemplate.execute((RedisCallback<String>) connection->{
			JedisCommands jedisCommands = (JedisCommands) connection.getNativeConnection();
			return jedisCommands.set(key, value, "NX", "PX", unit.toMillis(times));
		});
		return !StringUtils.isEmpty(result);
		}catch(Exception e){
		  System.out.println("-----"+e.getMessage());
		}
		return false;
	}
	
	
	/**
	 * 
	 */
	
	public String getValue(String key) {
		try {
			String result = redisTemplate.execute((RedisCallback<String>) connection->{
				JedisCommands jedisCommands = (JedisCommands) connection.getNativeConnection();
				return jedisCommands.get(key);
			});
			}catch(Exception e){
			  System.out.println("- get redis data failed---"+e.getMessage());
			}
		return null;
	}
	

}
