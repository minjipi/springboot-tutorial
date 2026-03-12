package com.example.startspring;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/요청받는주소")  // 누군가 요청받는주소로 http 요청 보내면 해당 클래스를 실행함.
public class 요청받고응답하는클래스 {


    /**
     * HTTP 요청
     *     GET  /요청받는주소/abc?var01=123  HTTP/1.1
     *     Host: www.naver.com
     *     Contet-Type: text/html
     *
     */
    @GetMapping("/abc")
    public String 기능01(@RequestParam String var01) {
        System.out.println(var01);
        return "zzz";
    }


    /**
     * HTTP 요청
     *     POST  /요청받는주소/def  HTTP/1.1
     *     Host: www.naver.com
     *     Contet-Type: text/html
     *
     *     var02=456
     */

    @PostMapping("/def")
    public String 기능02(@RequestParam String var02){
        System.out.println(var02);

        return "def";
    }


    /**
     * HTTP 요청
     *     POST  /요청받는주소/ghi  HTTP/1.1
     *     Host: www.naver.com
     *     Contet-Type: text/html
     *
     *     { "var03": "value03"}
     */


    @PostMapping("/ghi")
    public UserDto.Response 기능03(@RequestBody UserDto.Request requestDto) {
        System.out.println(requestDto.getName());
        UserDto.Response response = new UserDto.Response();
        response.setId(1);
        response.setName(requestDto.getName());
        return response;
    }


//    1. 요청과 응답을 하나의 DTO로 사용하는 방식
//    2. 요청 DTO와 응답 DTO를 분리하는 방식
//    3. Inner Class로 한 파일에서 관리하는 방식
}
