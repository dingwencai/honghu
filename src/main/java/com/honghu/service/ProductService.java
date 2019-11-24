package com.honghu.service;

import com.github.pagehelper.PageInfo;
import com.honghu.model.Product;
import com.honghu.model.ProductExample;

import java.util.List;
import java.util.Map;

public interface ProductService {

    PageInfo<Product> selectByMapExample(Map example);

}
