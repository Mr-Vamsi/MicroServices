package com.ecomApp.UserServices.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomApp.UserServices.Entities.userServicesEntity;
import com.ecomApp.UserServices.Repositories.userServicesRepository;

@Service
public class userServicesServiceImpl implements userServicesService {
    @Autowired
    private userServicesRepository repository;

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
}
