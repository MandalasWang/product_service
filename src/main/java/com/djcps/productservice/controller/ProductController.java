package com.djcps.productservice.controller;

import com.djcps.productservice.domain.Product;
import com.djcps.productservice.dto.ProductDto;
import com.djcps.productservice.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vi/product")
public class ProductController {
   @Value("${server.port}")
    private  String port;
    @Autowired
    private ProductService productService;

    /**
     * 查询商品列表
     * @return
     */
    @RequestMapping("/list")
    public List<Product> listproduct(){
       return productService.listproduct();
    }

    /**
     * 根据商品id查询商品信息
     * @param id
     * @return
     */
    @RequestMapping("/find")
    public  Product findByid(@RequestParam(value = "id") String id){

        Product product = productService.findById(id);
        Product result = new Product();
        BeanUtils.copyProperties(product,result);
        result.setPname(result.getPname()+"data from port "+port);
        return result;
    }

    /**
     * 查询所有的商品信息
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/page")
    public PageInfo list(@RequestParam(value = "page" ,defaultValue = "1") int page,
                              @RequestParam(value = "size",defaultValue = "10") int size){
        PageHelper.startPage(page,size);
        List<Product> list = productService.listproduct();
        PageInfo<Product> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public PageInfo getProductByCondition(@RequestBody @Validated  ProductDto productDto
    ){
        PageHelper.startPage(productDto.getPageNum(),productDto.getPageSize());
        List<Product> list = productService.getProductByCondition(productDto);
        PageInfo<Product> pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
