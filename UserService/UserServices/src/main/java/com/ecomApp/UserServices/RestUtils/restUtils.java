package com.ecomApp.UserServices.RestUtils;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecomApp.UserServices.DTO.productsDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class restUtils {
    productsDTO pdto = new productsDTO();

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
        List<productsDTO> ProductsDTO = new ArrayList<>();        
        Response response = RestAssured.given().get("http://localhost:9090/getAllProducts");
        int responseCode = response.getStatusCode();
        System.out.println(response.asString());
        System.out.println(responseCode);
        if(responseCode == 200){
            JSONArray jsonArray = new JSONArray(response.asString());
            int Size = jsonArray.length();
            System.out.println(jsonArray.getJSONObject(0));
            for(int i=0;i<Size ;i++){
                JSONObject object = jsonArray.getJSONObject(i);
                System.out.println(object);

                System.out.println("Product name is :- "+object.getString("productname"));

                pdto.setProductname(object.getString("productname"));
                pdto.setProducttype(object.getString("producttype"));
                pdto.setProductdescription(object.getString("productdescription"));
                pdto.setProductcost(object.getString("productcost"));
                pdto.setProductquantity(object.getString("productquantity"));

                System.out.println("Dto data is :- ");

                ProductsDTO.add(pdto);
            }
            return ProductsDTO;
        }else{
            return null;
        }
    }
}
