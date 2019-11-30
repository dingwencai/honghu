package com.honghu.manage.controller;

import com.honghu.manage.service.FileService;
import com.honghu.manage.vo.HttpResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/file")
@Api("文件上传")
@Slf4j
public class FileUploadController {

    @Autowired
    private FileService fileService;

    @RequestMapping(path = "/upload", method = RequestMethod.POST)
    @ApiOperation(value = "获取产品列表", notes="获取产品列表")
    public HttpResultVo upload(@ApiParam(value = "上传文件流")@RequestParam MultipartFile file,
                            @ApiParam(value = "文件名称")@RequestParam String name) {
        log.info("文件name:" + name);
        fileService.upload(name,"",file);
        return HttpResultVo.ok();
    }

    @RequestMapping(path = "/test", method = RequestMethod.POST)
    @ApiOperation(value = "测试", notes="测试")
    public HttpResultVo upload(@ApiParam(value = "文件名称")@RequestParam String name) {
        log.info("文件name:" + name);
        return HttpResultVo.ok();
    }

}
