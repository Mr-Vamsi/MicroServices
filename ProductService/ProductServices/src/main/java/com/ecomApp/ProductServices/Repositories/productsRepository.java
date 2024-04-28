package com.ecomApp.ProductServices.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ecomApp.ProductServices.Entities.productsEntity;

@Repository
public interface productsRepository extends MongoRepository<productsEntity , String> {
    
}
