package com.willshao.springbootmall.dao;

import com.willshao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
