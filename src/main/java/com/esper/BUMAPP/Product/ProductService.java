package com.esper.BUMAPP.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public static Product getProduct(products) {
        Product product = new Product();
        product.setDescription(product.getDescription());
        product.setImageURL(product.getImageURL());
        product.setPrice(product.getPrice());
        product.setName(product.getName());
        return product;
    }
}
