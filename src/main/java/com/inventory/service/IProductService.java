package com.inventory.service;

import com.inventory.entities.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);
    public Product addProduct(Product product);
    public void deleteProductById(Integer id);
}
