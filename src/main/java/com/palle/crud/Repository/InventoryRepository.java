package com.palle.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.palle.crud.entity.Product;
@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer>{

}
