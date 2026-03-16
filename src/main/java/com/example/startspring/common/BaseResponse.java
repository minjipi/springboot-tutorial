package com.example.startspring.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static com.example.startspring.common.BaseResponseStatus.SUCCESS;

@Getter
@Setter
@AllArgsConstructor
public class BaseResponse<T> {
    private boolean success;
    private int code;
    private String message;
    private T result;

    public static <T> BaseResponse<T> success(T result) {
        return new BaseResponse(
                SUCCESS.isSuccess(),
                SUCCESS.getCode(),
                SUCCESS.getMessage(),
                result
        );
    }

    public static <T> BaseResponse<T> fail(BaseResponseStatus status) {
        return new BaseResponse(
                SUCCESS.isSuccess(),
                SUCCESS.getCode(),
                SUCCESS.getMessage(),
                null
        );
    }

    public static <T> BaseResponse<T> fail(BaseResponseStatus status, T result) {
        return new BaseResponse(
                SUCCESS.isSuccess(),
                SUCCESS.getCode(),
                SUCCESS.getMessage(),
                result
        );
    }
}
