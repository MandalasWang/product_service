package com.djcps.productservice.mapper;

import com.djcps.productservice.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 有缘
 * @date 2019 6/6
 */
public interface ProductMapper {
    /**
     *
     * @return
     */
    @Select("select pname,price,pid,price,store  from product")
    public List<Product> listproduct();

    @Select("select pname,price,pid,price,store  from product where pid = #{id}")
    public Product findById(String id);
}
