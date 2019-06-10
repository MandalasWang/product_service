package com.djcps.productservice.domain;

import java.io.Serializable;

public class Product implements Serializable {
    public Product() {

    }

    public Product(Integer id, String pname, Double price, int store) {
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.store = store;
    }

    /**
     * 商品id
     */
    private Integer id;


    /**
     * 商品名称
     */
    private String pid;

    private String pname;
    /**
     * 商品价格
     */
    private Double price;
    /**
     * 库存
     */
    private int store;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", store=" + store +
                '}';
    }
}
