package com.ecomApp.UserServices.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class productsDTO {

    private String productname;
    private String producttype;
    private String productdescription;
    private String productcost;
    private String productquantity;
}
