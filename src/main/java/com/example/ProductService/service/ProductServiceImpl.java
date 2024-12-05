package com.example.ProductService.service;

import com.example.ProductService.entity.Product;
import com.example.ProductService.entity.exception.ProductServiceCustomException;
import com.example.ProductService.model.ProductRequest;
import com.example.ProductService.model.ProductResponse;
import com.example.ProductService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest) {

        Product product = new Product();
        System.out.println(productRequest.getProductName());

        BeanUtils.copyProperties(productRequest, product);



        productRepository.save(product);


        return product.getProductId();
    }

    @Override
    public ProductResponse getProductById(long productId) {
        Product product=productRepository.findById(productId)
                .orElseThrow(()-> new ProductServiceCustomException("Product not found","PRODUCT_NOT_FOUND"));

        ProductResponse productResponse=new ProductResponse();
        BeanUtils.copyProperties(product,productResponse);
        return productResponse;
    }
}
