package com.inventory.controller;

import com.inventory.entities.Product;
import com.inventory.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http:/localhost:8080/inveantio-app agregaremos un context path
@RequestMapping("inventory-app")
@CrossOrigin(value = "http://localhost:4200") // esto es para configuracion angular
public class ProductController {

    private static final Logger logger =
            LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private  ProductService productService;

    //http://localhost:8080/inventory-app/products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        products.forEach(product -> logger.info(product.toString()));
        return products;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        logger.info(product.toString());
       return this.productService.addProduct(product);
    }

}
