package com.honghu.manage.service.impl;

import com.honghu.manage.Config.FileConfig;
import com.honghu.manage.service.FileService;
import com.honghu.manage.utils.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Autowired
    private FileConfig fileConfig;

    /**
     * 上传文件
     * @param md5
     * @param file
     */
    @Override
    public void upload(String name, String md5, MultipartFile file) {
        String path = fileConfig.getBasePath() + FileUtils.generateFileName();
        log.info("name:" + name);
        log.info("md5:" + md5);
        log.info("path:" + path);
        try {
            FileUtils.write(path, file.getInputStream());
        } catch (IOException e) {
            log.error("IO", e);
        }
    }

}
