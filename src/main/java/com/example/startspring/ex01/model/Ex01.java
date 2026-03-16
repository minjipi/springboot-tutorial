package com.example.startspring.ex01.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity // 자바 클래스로 RDB의 테이블을 만들어주는 것.
public class Ex01 {
    @Id // 기본키 속성 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private String var01;
    private String var02;

    // CREATE TABLE ex0 (
    //      idx  INT PRIMARY KEY AUTO_INCREMENT,
    //      var01 VARCHAR(255),
    //      var02 VARCHAR(255)
    // )

    // idx  |  var01  |  var02
    //   1      값01       값02
    //   2      값01       값02
    //   3      값01       값02
    //   4      값01       값02


}
