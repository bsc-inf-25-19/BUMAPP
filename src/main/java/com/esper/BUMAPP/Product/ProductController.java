package com.esper.BUMAPP.Product;

import com.esper.BUMAPP.common.ApiResponse;
import com.esper.BUMAPP.user.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<Product>> getProduct() {
        List<Product> dtos = productService.();
        return new ResponseEntity<List<UserProfile>>(dtos, HttpStatus.OK);


    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addProduct(Product){
        productService.addProduct(Product);
        return new ResponseEntity<>(new ApiResponse(true, "Product has been added"));
    }

}
