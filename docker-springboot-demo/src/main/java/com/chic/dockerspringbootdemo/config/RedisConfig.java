package com.chic.dockerspringbootdemo.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import com.chic.dockerspringbootdemo.util.RedisServiceUtil;

@Configuration
@AutoConfigureAfter(RedisAutoConfiguration.class)//使用springboot自动配置
public class RedisConfig {
	
	@Bean
	public RedisServiceUtil getRedisTempate(RedisTemplate<Object, Object> redisTemplate){
		return new RedisServiceUtil(redisTemplate);
		
	}

}
