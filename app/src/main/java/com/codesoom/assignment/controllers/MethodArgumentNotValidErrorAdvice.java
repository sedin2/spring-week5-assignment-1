package com.codesoom.assignment.controllers;

import com.codesoom.assignment.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 유효성 검사 관련 예외처리를 담당합니다.
 */
@ControllerAdvice
public class MethodArgumentNotValidErrorAdvice {

    /**
     * 요청 한 메소드의 인자값이 유효하지 않을 때 에러 메세지를 리턴합니다.
     * @return 에러 메세지
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleMethodArgumentNotValidException() {
        return new ErrorResponse("Invalid request");
    }
}