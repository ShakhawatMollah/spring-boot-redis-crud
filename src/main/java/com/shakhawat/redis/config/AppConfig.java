package com.shakhawat.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.shakhawat.redis.model.Employee;

@Configuration
public class AppConfig {

	//Creating Connection with Redis
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
	   return new LettuceConnectionFactory();
	}
	
	//Creating RedisTemplate for Entity 'Employee'
	@Bean
	public RedisTemplate<String, Employee> redisTemplate(){
	  RedisTemplate<String, Employee> empTemplate = new RedisTemplate<>();
	  empTemplate.setConnectionFactory(redisConnectionFactory());
	  return empTemplate;
	}
	   
}
