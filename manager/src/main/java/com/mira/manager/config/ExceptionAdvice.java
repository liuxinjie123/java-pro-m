package com.mira.manager.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mira.common.exception.BusinessException;
import com.mira.common.vo.Constants;
import com.mira.common.vo.Result;
import com.mira.common.exception.NotFoundException;
import com.mira.common.exception.UnauthorizedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionAdvice {
    @Autowired
    private ObjectMapper om;

    @Autowired
    private Session adminSession;

    @ExceptionHandler({MethodArgumentNotValidException.class, TypeMismatchException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Result process400Error(Exception ex) {
        log.error("400Exception:", ex);
        String flag1 = "default message [";
        String flag2 = "]";
        int startPlace = ex.getMessage().toString().lastIndexOf(flag1) + 17;
        if (startPlace != -1) {
            String message = ex.getMessage().substring(startPlace);
            int endPlace = message.indexOf(flag2);
            String error = message.substring(0, endPlace);
            String field = "";
            if (error.startsWith("账号")) field = "username";
            else if (error.startsWith("密码")) field = "password";
            return Result.build("400", error, field);
        } else {
            return Result.error("400", ex.getMessage());
        }
    }


    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Result process401Error(UnauthorizedException ex) {
        log.error("401 Exception: " + ex);
        return Result.error(Constants.CODE_401, Constants.LOGIN_REQUIRED);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Result process404Error(NotFoundException ex) {
        log.error("404 NotFoundException : ", ex);
        return Result.error(Constants.CODE_404, ex.getMessage());
    }


    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public Result process409Error(BusinessException ex) {
        log.error("409 Exception: ", ex);
        return Result.error(Constants.CODE_409, ex.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(MultipartException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public Result processFileUploadException(HttpServletRequest request, Exception ex) {
        log.error("MultipartException: ", ex);
        if (ex instanceof MultipartException) {
            if (ex.toString().contains("org.apache.tomcat.util.http.fileupload.FileUploadBase$SizeLimitExceededException")) {
                return Result.error(Constants.CODE_409, Constants.FILE_SIZE_OVER_LIMIT_30);
            }
        }
        return process500Error(request, ex);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result process500Error(HttpServletRequest request, Exception ex) {
        log.error("500 Exception: ", ex);
//        handler500(request, ex);
        return Result.error(Constants.CODE_500, ex.getMessage());
    }

}
