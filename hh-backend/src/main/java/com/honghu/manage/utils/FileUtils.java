package com.honghu.manage.utils;


import java.io.*;
import java.util.UUID;

public class FileUtils {

    /**
     * 写入文件
     * @param target
     * @param src
     * @throws IOException
     */
    public static void write(String target, InputStream src) throws IOException {
        OutputStream os = new FileOutputStream(target);
        byte[] buf = new byte[1024];
        int len;
        while (-1 != (len = src.read(buf))) {
            os.write(buf,0,len);
        }
        os.flush();
        os.close();
    }

    /**
     * 生成文件名
     * @return
     */
    public static String generateFileName() {
        return UUID.randomUUID().toString();
    }
}
