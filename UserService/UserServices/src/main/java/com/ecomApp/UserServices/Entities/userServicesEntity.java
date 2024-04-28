package com.ecomApp.UserServices.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "UserServices")
public class userServicesEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String company;
    private String userType;
    private String password;
}