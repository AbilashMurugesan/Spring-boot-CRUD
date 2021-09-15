package com.example.javaguides.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javaguides.dao.ProductRepo;
import com.example.javaguides.model.ProductEntity;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepo pr;
	
	public ProductEntity save(ProductEntity pe)
	{
		return pr.save(pe);
	}
	
	public List<ProductEntity> saveList(List<ProductEntity> pe)
	{
		return pr.saveAll(pe);
	}
	
	public List<ProductEntity> getAll()
	{
		return pr.findAll();
	}
	
	public ProductEntity getById(int id)
	{
		return pr.findById(id).orElse(null);
	}
	
	public List<ProductEntity> getByName(String name)
	{
		return pr.findByName(name);
	}
	
	public ProductEntity update(ProductEntity pe)
	{
		ProductEntity existProd=pr.findById(pe.getId()).orElse(null);
		
		existProd.setName(pe.getName());
		existProd.setQuantity(pe.getQuantity());
		existProd.setPrice(pe.getPrice());
		
		return pr.save(existProd);
	}
	
	public String delete(int id)
	{
		pr.deleteById(id);
		return "the entry is deleted for the id= " + id;
	}
	
	
	
	
	
	
	
	
}
