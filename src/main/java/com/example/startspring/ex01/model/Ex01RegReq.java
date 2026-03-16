package com.example.startspring.ex01.model;

import lombok.Getter;

@Getter
public class Ex01RegReq {
    private String var01;
    private String var02;

    public Ex01 toEntity(){
        return Ex01.builder()
                .var01(this.var01)
                .var02(this.var02)
                .build();
    }

}
