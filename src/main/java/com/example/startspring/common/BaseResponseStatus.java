package com.example.startspring.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BaseResponseStatus {
    SUCCESS(true, 2000, "success"),
    FAIL(false, 2000, "fail"),;

    private final boolean success;
    private final int code;
    private final String message;
}
