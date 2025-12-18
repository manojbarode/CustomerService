package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	MyRepo repo;
	@PostMapping("/cust")
	public Customer add(@RequestBody Customer c)
	{
		return repo.save(c);
	}
	@GetMapping("/cust")
	public List<Customer> show()
	{
		return repo.findAll();
	}
	@GetMapping("/cust/{id}")
	public Optional<Customer> showById(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
}
