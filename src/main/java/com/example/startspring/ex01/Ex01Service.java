package com.example.startspring.ex01;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.startspring.ex01.model.Ex01;
import com.example.startspring.ex01.model.Ex01ReadRes;
import com.example.startspring.ex01.model.Ex01RegReq;
import com.example.startspring.ex01.model.Ex01RegRes;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Ex01Service {
    private final Ex01Repository ex01Repository;

    public Ex01RegRes reg(Ex01RegReq dto) {
        Ex01 ex01 = ex01Repository.save(dto.toEntity());
        return Ex01RegRes.from(ex01);
    }

    public Ex01ReadRes read(long idx) {
        Ex01 ex01 = ex01Repository.findById(idx).orElseThrow(RuntimeException::new);
        return Ex01ReadRes.from(ex01);
    }

    public List<Ex01ReadRes> list(){
        List<Ex01> ex01List = ex01Repository.findAll();
        return ex01List.stream().map(Ex01ReadRes::from).collect(Collectors.toList());
    }
}
