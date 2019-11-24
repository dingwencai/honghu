package com.honghu.controller;

import com.honghu.service.ProductService;
import com.honghu.vo.HttpResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/product")
@Api("产品")
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "获取产品列表", notes="获取产品列表")
    public HttpResultVo get(@ApiParam(value = "当前页面num")@RequestParam( defaultValue="0" ) Integer pageNum,
                            @ApiParam(value = "页面大小")@RequestParam( defaultValue="10" ) Integer pageSize) {
        LOG.info("pageNum:" + pageNum);
        LOG.info("pageSize:" + pageSize);

        Map<String,Object> example = new HashMap<>();
        example.put("pageNum", pageNum);
        example.put("pageSize", pageSize);

        Object list = productService.selectByMapExample(example);

        return HttpResultVo.ok(list);
    }

}
