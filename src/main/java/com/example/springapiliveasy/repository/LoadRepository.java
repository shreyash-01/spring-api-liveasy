package com.example.springapiliveasy.repository;

import com.example.springapiliveasy.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadRepository extends JpaRepository<Load, String> {

    //List<Load> findLoadByShipperId(String shipperId);
}
