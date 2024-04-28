package com.ecomApp.UserServices.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.ecomApp.UserServices.DTO.productsDTO;
import com.ecomApp.UserServices.Entities.userServicesEntity;
import com.ecomApp.UserServices.Services.userServicesService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userServicesController {
    @Autowired
    private userServicesService service;

    @RequestMapping("/login")
    public String renderLogin() {
        return "LoginPage";
    }

    @RequestMapping("/register")
    public String renderRegister() {
        return "RegistrationPage";
    }

    @RequestMapping("/ListProducts")
    public String listProducts() {
        return "ListProductDetails";
    }

    @RequestMapping("/Logout")
    public String userLogout() {
        return "LoginPage";
    }

    @RequestMapping("/saveUserData")
    public String saveUserDetails(@ModelAttribute("userServicesEntity") userServicesEntity entity) {
        userServicesEntity data = service.saveUserData(entity);
        if (data != null) {
            return "LoginPage";
        } else {
            return "RegistrationPage";
        }
    }

    @RequestMapping("/userLogin")
    public String verifyUserLogin(@RequestParam("email") String email, @RequestParam("password") String password,
            ModelMap modelMap) {
        userServicesEntity entity = service.validateUserLogin(email, password);
        if (entity != null) {
            if (entity.getUserType().equals("Buyer")) {
                modelMap.addAttribute("name", entity.getName());
                return "BuyerHomePage";
            } else if (entity.getUserType().equals("Seller")) {
                modelMap.addAttribute("name", entity.getName());
                return "SellerHomePage";
            } else {
                return "LoginPage";
            }
        } else {
            modelMap.addAttribute("msg", "Please check the Email / Password ");
            return "LoginPage";
        }
    }
    @RequestMapping("/createProduct")
    public String saveProduct(@ModelAttribute("productsDTO") productsDTO productsDTO , ModelMap modelMap){
        String  message = service.saveProduct(productsDTO);
        modelMap.addAttribute("msg", message);
        return "ListProductDetails";
    }
    @RequestMapping("/ProductsData")
    public String fetchAllProducts(ModelMap modelMap){
       List<productsDTO> productsList = service.fetchAllProducts();
       return "allProductsPage";
    }
}
