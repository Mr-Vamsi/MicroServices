package com.ecomApp.UserServices.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ecomApp.UserServices.Entities.userServicesEntity;

@Repository
public interface userServicesRepository extends MongoRepository<userServicesEntity, String>{
    public userServicesEntity findByEmail(String email);
}
