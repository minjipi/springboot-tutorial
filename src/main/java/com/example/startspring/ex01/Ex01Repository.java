package com.example.startspring.ex01;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.startspring.ex01.model.Ex01;

public interface Ex01Repository extends JpaRepository<Ex01, Long> {
}
