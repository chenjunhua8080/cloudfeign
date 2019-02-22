package com.cloudfeign.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather", method = RequestMethod.GET)
public class WeatherControl {

	@Autowired
	private WeatherFeign weatherFeign;

	@GetMapping("/now/{location}")
	public String now(@PathVariable("location") String location) {
		return weatherFeign.now(location);
	}

	@GetMapping("/life/{location}")
	public String life(@PathVariable("location") String location) {
		return weatherFeign.life(location);
	}

	@GetMapping("/daily/{location}")
	public String daily(@PathVariable("location") String location) {
		return weatherFeign.daily(location);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@RequestParam("name") String name,@RequestParam("pass") String pass) {
		return weatherFeign.register(name,pass);
	}
	
	@RequestMapping(value = "/userList/{page}", method = RequestMethod.GET)
	public Object userList(@PathVariable("page") Integer page) {
		return weatherFeign.userList(page);
	}

}
