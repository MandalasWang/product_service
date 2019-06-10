package com.djcps.productservice.service.impl;

import com.djcps.productservice.domain.Product;
import com.djcps.productservice.dto.ProductDto;
import com.djcps.productservice.mapper.ProductMapper;
import com.djcps.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 有缘
 * @date 2019 6/6
 */
@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> listproduct() {
        List<Product> list = productMapper.listproduct();
        return list;
    }

    @Override
    public Product findById(String id) {
       return productMapper.findById(id);
    }


    @Override
    public List<Product> getProductByCondition(ProductDto productDto) {
        return null;
    }
}
