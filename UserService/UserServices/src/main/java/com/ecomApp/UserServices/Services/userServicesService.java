package com.ecomApp.UserServices.Services;

import com.ecomApp.UserServices.Entities.userServicesEntity;

public interface userServicesService {
    public userServicesEntity saveUserData(userServicesEntity entity);
    public userServicesEntity validateUserLogin(String email,String password);
}
