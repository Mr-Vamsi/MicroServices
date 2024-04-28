package com.ecomApp.UserServices.Services;

import java.util.List;

import com.ecomApp.UserServices.DTO.productsDTO;
import com.ecomApp.UserServices.Entities.userServicesEntity;

public interface userServicesService {
    public userServicesEntity saveUserData(userServicesEntity entity);
    public userServicesEntity validateUserLogin(String email,String password);
    public String saveProduct(productsDTO productsDTO);
    public List<productsDTO> fetchAllProducts();
}
