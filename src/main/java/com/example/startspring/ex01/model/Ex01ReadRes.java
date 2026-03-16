package com.example.startspring.ex01.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Ex01ReadRes {
    private long idx;
    private String var01;
    private String var02;


    public static Ex01ReadRes from(Ex01 entity) {
        return Ex01ReadRes.builder()
                .idx(entity.getIdx())
                .var01(entity.getVar01())
                .var02(entity.getVar02())
                .build();
    }
}
