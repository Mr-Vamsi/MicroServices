package com.ecomApp.ProductServices.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecomApp.ProductServices.Entities.productsEntity;
import com.ecomApp.ProductServices.Repositories.productsRepository;

@Service
public class productsServiceImpl implements productsService{

    @Autowired
    private productsRepository repository;

    @Override
    public List<productsEntity> getAllProducts() {
        List<productsEntity> allProducts = repository.findAll();
        if(allProducts != null){
            return allProducts;
        }else{
            return allProducts;
        }
    }

    @Override
    public productsEntity addProduct(productsEntity entity) {
        productsEntity addedProduct  = repository.save(entity);
        if(addedProduct!=null){
            return addedProduct;
        }else{
            return null;
        }
    }
    
}
