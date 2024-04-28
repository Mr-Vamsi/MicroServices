package com.ecomApp.ProductServices.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "products")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class productsEntity {
    @Id
    private String productsku;
    private String productname;
    private String producttype;
    private String productdescription;
    private String productcost;
    private String productquantity;
}