package com.honghu.global;

import com.honghu.vo.HttpResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * 统一 Exception 处理
 */
@ControllerAdvice
@ResponseBody
public class WebGlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(WebGlobalExceptionHandler.class);

    /*@ExceptionHandler
    public ResultBean unknownAccount(UnknownAccountException e) {
        log.error("账号不存在", e);
        return ResultBean.error(1, "账号不存在");
    }

    @ExceptionHandler
    public ResultBean incorrectCredentials(IncorrectCredentialsException e) {
        log.error("密码错误", e);
        return ResultBean.error(-2, "密码错误");
    }*/

    @ExceptionHandler
    public HttpResultVo unknownException(Exception e) {
        log.error("发生了未知异常-", e);
        // 发送邮件通知技术人员
        Throwable cause = e.getCause();
        if (cause != null) return HttpResultVo.error(-1, e.getCause().toString());
        else return HttpResultVo.error(-1, "unknown error!");
    }

    @ExceptionHandler
    public HttpResultVo unknownException(NullPointerException e) {
        log.error("NullPointerException-", e);
        // 发送邮件通知技术人员
        return HttpResultVo.error(-2, "NPE Error!");
    }

    @ExceptionHandler
    public HttpResultVo unknownException(SQLException e) {
        log.error("SQLException-", e);
        return HttpResultVo.error(-2, "SQL Error!");
    }
}

