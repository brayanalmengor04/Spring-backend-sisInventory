package com.inventory.service;

import com.inventory.entities.Product;
import com.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
      return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer id) {
        this.productRepository.deleteById(id);
    }
}
