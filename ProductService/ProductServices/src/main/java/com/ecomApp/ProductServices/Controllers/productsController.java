package com.ecomApp.ProductServices.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.ecomApp.ProductServices.Entities.productsEntity;
import com.ecomApp.ProductServices.Services.productsService;

@RestController
public class productsController {

    @Autowired
    private productsService service;

    @GetExchange("/getAllProducts")
    public ResponseEntity<List<productsEntity>> fetchAllProducts(){
        List<productsEntity> products = service.getAllProducts();
        if(products!=null){
            return new ResponseEntity<>(products,HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_EXTENDED);
        }
    }
    @PostMapping("/addProduct")
    public ResponseEntity<productsEntity> addProducts(@RequestBody productsEntity entity){
        productsEntity addedProduct = service.addProduct(entity);
        if(addedProduct!=null){
            return new ResponseEntity<>(addedProduct,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}
