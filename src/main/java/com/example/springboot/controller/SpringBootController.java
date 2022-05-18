package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot.entity.User;


@Controller
public class SpringBootController {
	
	@GetMapping("/hello")
	public String sayHello() {
        return "Hello Everyone";
    }
	
	@RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
	public String sayHelloDifferently() {
        return "Hello Everyone";
    }
	@GetMapping("/hello/query")
	public String sayPosting(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

	@PostMapping("/hello/{firstName}")
	public String sayHello(@PathVariable String firstName) {
        return "Hello " + firstName;
    }
	
	@PostMapping("/hello/post")
    public String sayPost(@RequestBody User user) {

        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/hello/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
	
	
}
