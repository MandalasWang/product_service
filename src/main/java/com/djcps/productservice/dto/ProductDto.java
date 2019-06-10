package com.djcps.productservice.dto;

import com.github.pagehelper.Page;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class ProductDto extends Page {

    /**
     * 商品名称
     */
    @Size(max = 20,min = 2)
    private String pname;
    /**
     * 商品价格
     */
    @Min(0)
    private Double price;
    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 当前时间
     */
    private String endTime;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ProductDto() {
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "pname='" + pname + '\'' +
                ", price=" + price +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
