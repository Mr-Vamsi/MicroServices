package com.ecomApp.ProductServices.Services;

import java.util.List;
import com.ecomApp.ProductServices.Entities.productsEntity;

public interface productsService {
    public List<productsEntity> getAllProducts();
    public productsEntity addProduct(productsEntity entity);
}
