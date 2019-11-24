package com.honghu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.honghu.dao.ProductMapper;
import com.honghu.model.Product;
import com.honghu.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productDao;

    @Override
    public PageInfo<Product> selectByMapExample(Map example) {
        LOG.info(example.toString());
        //        PageHelper.startPage((Integer)example.get("pageNum"), (Integer)example.get("pageSize"));
        PageInfo<Product> pageInfo = PageHelper.startPage((Integer) example.get("pageNum"), (Integer) example.get("pageSize"))
                .doSelectPageInfo(() -> productDao.selectByMapExample(example));

        return pageInfo;
    }
}
