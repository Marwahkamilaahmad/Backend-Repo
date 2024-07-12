package com.example.crud_spring_boot.models.repos;

import com.example.crud_spring_boot.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepo extends CrudRepository<Product, Long>{

}
