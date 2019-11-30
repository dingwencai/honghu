package com.honghu.manage.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    void upload(String name,String md5,MultipartFile file);

}
