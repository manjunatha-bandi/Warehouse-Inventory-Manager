package com.palle.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palle.crud.entity.Product;
import com.palle.crud.service.InventoryService;

@RestController
@RequestMapping("/myapp")
public class InventoryController {
		@Autowired
		private InventoryService service;
		// insert Rest API
		@PostMapping("/insert")
		public Product saveData(@RequestBody Product p) {
			return service.insertData(p);
		}
		
		//readALL REST API
		@GetMapping("/readall")
		public List<Product> getAll() {
			return service.readAll();
		}
		//Read ONE REST API
		@GetMapping("/readone/{id}")
		public Optional<Product> getOneDate(@PathVariable int id) {
			return service.readOne(id);
		}
		//Delete One REST API
		@DeleteMapping("/deleteone/{num}")
		public void deleteOne(@PathVariable int num) {
			service.deleteOne(num);
		}
		//update one Rest API
		@PutMapping("/update/{id}")
		public Product updatedata(@PathVariable int id,@RequestBody Product p) {
			return service.updateProduct(id, p);
		} 
		
		
}
