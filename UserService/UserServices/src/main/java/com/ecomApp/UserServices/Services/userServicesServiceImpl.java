package com.ecomApp.UserServices.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomApp.UserServices.DTO.productsDTO;
import com.ecomApp.UserServices.Entities.userServicesEntity;
import com.ecomApp.UserServices.Repositories.userServicesRepository;
import com.ecomApp.UserServices.RestUtils.restUtils;

@Service
public class userServicesServiceImpl implements userServicesService {
    @Autowired
    private userServicesRepository repository;
    public restUtils utils = new restUtils();

    @Override
    public userServicesEntity saveUserData(userServicesEntity entity) {
        userServicesEntity userData = repository.save(entity);
        if (userData != null) {
            return userData;
        } else {
            return userData;
        }
    }

    @Override
    public userServicesEntity validateUserLogin(String email, String password) {
        userServicesEntity entity = repository.findByEmail(email);
        if (email.equals(entity.getEmail()) && password.equals(entity.getPassword())) {
            return entity;
        } else {
            return entity;
        }
    }

    @Override
    public String saveProduct(productsDTO productsDTO) {
        int statusCode = utils.addProducts(productsDTO);
        if (statusCode == 201) {
            return "Product is added to the inventory";
        } else {
            return "Product is not added to the inventory";
        }
    }

    @Override
    public List<productsDTO> fetchAllProducts() {
        List<productsDTO> dtos = utils.fetchAllProducts();
        System.out.println(String.valueOf(dtos));
        return dtos;
    }
}
