package com.ecomApp.UserServices.RestUtils;

import java.util.ArrayList;
import java.util.List;

import com.ecomApp.UserServices.DTO.productsDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class restUtils {

    public int addProducts(productsDTO productsDTO) {
        String body = "{\r\n" + //
                "    \"productname\":\"" + productsDTO.getProductname() + "\",\r\n" + //
                "    \"producttype\":\"" + productsDTO.getProducttype() + "\",\r\n" + //
                "    \"productdescription\":\"" + productsDTO.getProductdescription() + "\",\r\n" + //
                "    \"productcost\":\"" + productsDTO.getProductcost() + "\",\r\n" + //
                "    \"productquantity\":\"" + productsDTO.getProductquantity() + "\"\r\n" + //
                "}";
        Response response = RestAssured.given().body(body).contentType(ContentType.JSON)
                .post("http://localhost:9090/addProduct");
        int statusCode = response.getStatusCode();
        return statusCode;
    }

    public List<productsDTO> fetchAllProducts() {
        List<productsDTO> productsDTOs = new ArrayList<>();
        Response response = RestAssured.given().get("http://localhost:9090/getAllProducts");
        int noOfRecords = response.getBody().jsonPath().getList("").size();
        System.out.println(noOfRecords);
        for (int i = 0; i < noOfRecords; i++) {
            productsDTO dto = new productsDTO();
            dto.setProductname(response.getBody().jsonPath().getString("productname["+i+"]"));
            System.out.println(response.getBody().jsonPath().getString("productname["+i+"]"));
            dto.setProducttype(response.getBody().jsonPath().getString("producttype["+i+"]"));
            dto.setProductdescription(response.getBody().jsonPath().getString("productdescription["+i+"]"));
            dto.setProductcost(response.getBody().jsonPath().getString("productcost["+i+"]"));
            dto.setProductquantity(response.getBody().jsonPath().getString("productquantity["+i+"]"));
            productsDTOs.add(dto);
        }
        return productsDTOs;
    }
}
