package com.djcps.productservice.service;

import com.djcps.productservice.domain.Product;
import com.djcps.productservice.dto.ProductDto;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有商品
     * @return
     */
    List<Product>  listproduct();

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    Product findById(String id);

    /**
     * 根据条件查询订单
     * @param productDto
     * @return
     */
    List<Product> getProductByCondition(ProductDto productDto);
}
