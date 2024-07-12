package com.example.crud_spring_boot.services;


import com.example.crud_spring_boot.models.entities.Product;
import com.example.crud_spring_boot.models.repos.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductServices {

    private ProductRepo productRepo;
    public Product create(Product product){
        return productRepo.save(product);
    }

    public Product findOne(Long id){
        return productRepo.findById(id).get();
    }
    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(Long id){
        productRepo.deleteById(id);
    }



}
