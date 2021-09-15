package com.example.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.javaguides.model.ProductEntity;
import com.example.javaguides.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	ProductService ps;
	
	@PostMapping("/create")
	public ProductEntity create(ProductEntity pe)
	{
		return ps.save(pe);
	}
	
	@PostMapping("/batchCreate")
	public List<ProductEntity> create(@RequestBody List<ProductEntity> pe)
	{
		return ps.saveList(pe);
	}
	
	@GetMapping("/getById")
	public ProductEntity getById(int id)
	{
		return  ps.getById(id);
	}
	
	@GetMapping("/getByName")
	public List<ProductEntity> getById(String name)
	{
		return  ps.getByName(name);
	}
	
	@GetMapping("/getAll")
	public List<ProductEntity> getAll()
	{
		return  ps.getAll();
	}
	
	@PutMapping("updating")
	public ProductEntity updating(ProductEntity pe)
	{
		return ps.update(pe);
	}
	
	@DeleteMapping("deleting")
	public String deleting(int id)
	{
		return ps.delete(id);
	}
}
