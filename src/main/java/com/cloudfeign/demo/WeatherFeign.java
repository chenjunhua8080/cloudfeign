package com.cloudfeign.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="service-weather",fallback=WeatherFeignFallback.class)
public interface WeatherFeign {
	
	@GetMapping("/weather/now/{location}")
	String now(@PathVariable("location") String location);
	
	@GetMapping("/weather/life/{location}")
	String life(@PathVariable("location") String location);
	
	@GetMapping("/weather/daily/{location}")
	String daily(@PathVariable("location") String location);
	
	@RequestMapping(value = "/weather/register", method = RequestMethod.GET)
	String register(@RequestParam(value = "name") String name,@RequestParam(value = "pass") String pass);
	
	@RequestMapping(value = "/weather/userList/{page}", method = RequestMethod.GET)
	Object userList(@PathVariable(value = "page") Integer page);

}
