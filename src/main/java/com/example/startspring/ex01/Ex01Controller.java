package com.example.startspring.ex01;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.startspring.common.BaseResponse;
import com.example.startspring.ex01.model.Ex01ReadRes;
import com.example.startspring.ex01.model.Ex01RegReq;
import com.example.startspring.ex01.model.Ex01RegRes;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ex01")
public class Ex01Controller {
    private final Ex01Service ex01Service;

    @GetMapping("/list")
    public ResponseEntity list() {
        List<Ex01ReadRes> response = ex01Service.list();

        return ResponseEntity.ok(
                BaseResponse.success(response)
        );
    }

    @GetMapping("/read/{idx}")
    public ResponseEntity read(@PathVariable long idx) {
        Ex01ReadRes response = ex01Service.read(idx);

        return ResponseEntity.ok(
                BaseResponse.success(response)
        );
    }

    @PostMapping("/reg")
    public ResponseEntity reg(@RequestBody Ex01RegReq dto) {
        Ex01RegRes response = ex01Service.reg(dto);
        return ResponseEntity.ok(
                BaseResponse.success(response)
        );
    }
}
