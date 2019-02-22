package com.cloudfeign.demo;

import org.springframework.stereotype.Component;

@Component
public class WeatherFeignFallback implements WeatherFeign{

	@Override
	public String now(String location) {
		// TODO Auto-generated method stub
		return "error in feign for fallback";
	}

	@Override
	public String life(String location) {
		// TODO Auto-generated method stub
		return "error in feign for fallback";
	}

	@Override
	public String daily(String location) {
		// TODO Auto-generated method stub
		return "error in feign for fallback";
	}

	@Override
	public String register(String name,String pass) {
		// TODO Auto-generated method stub
		return "error in feign for fallback";
	}

	@Override
	public String userList(Integer page) {
		// TODO Auto-generated method stub
		return "error in feign for fallback";
	}

}
