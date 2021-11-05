package com.petclinic.rest.controller;

import com.petclinic.rest.dto.BaseDto;
import com.petclinic.rest.model.BaseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public interface CommonController <T extends BaseDto> {
    @GetMapping("")
    List<T> getAll();

    @GetMapping("/{id}")
    T find(@PathVariable  Long id);

    @PostMapping("")
    T save(@RequestBody T elem);

    @PostMapping("/{id}")
    T update(@PathVariable Long id,@RequestBody T elem);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);

    @DeleteMapping("")
    void delete(@RequestBody T elem);
}
