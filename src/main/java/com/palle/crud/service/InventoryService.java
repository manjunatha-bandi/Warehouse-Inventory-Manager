package com.palle.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle.crud.Repository.InventoryRepository;
import com.palle.crud.entity.Product;

@Service
public class InventoryService {
	 @Autowired
	private InventoryRepository repository;
	//insert bussiness logic
	public Product insertData(Product p) {
		return repository.save(p);
	}
	
	//read all bussiness logic
	public List<Product> readAll() {
		return repository.findAll();
	}
	//read one business logic
	public Optional<Product> readOne(int id){
		return repository.findById(id);
	}
	//Delete ONe bussiness logic
	
	public void  deleteOne(int id) {
		 repository.deleteById(id);
	}
	
	//UPDATE bussiness logic
	public Product updateProduct(int id,Product np) {
		Optional<Product> opt = repository.findById(id);
		
		if(opt.isPresent()) {
			Product op = opt.get();
			//set old product with new product data
			op.setName(np.getName());
			op.setQty(np.getQty());
			op.setPrice(np.getPrice());
			return repository.save(op);
		}
		else {
			return opt.get();
		}
		
	}
	
       
  }