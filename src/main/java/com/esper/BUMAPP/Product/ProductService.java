package com.esper.BUMAPP.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> listProducts(){
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : products){
            ProductDto productDto = getDtoFromProduct(product);
            productDtos.add(productDto);
        }
        return productDtos;
    }

    public static ProductDto getDtoFromProduct(Product product){
        ProductDto productDto = new ProductDto(product);
        return productDto;
    }

    public static Product getProductFromDto(ProductDto productDto){
        Product product = new Product(productDto);
        return product;
    }

    public void addProduct(ProductDto productDto) {
        Product product = getProductFromDto(productDto);
        productRepository.save(product);
    }

    public void updateProduct(Integer productID, ProductDto productDto) {
        Product product = getProductFromDto(productDto);
        product.setId(productID);
        productRepository.save(product);


    public static Product getProduct(product) {
        Product product = new Product();
        product.setDescription(product.getDescription());
        product.setPrice(product.getPrice());
        product.setName(product.getName());
        return product;
    }
}
