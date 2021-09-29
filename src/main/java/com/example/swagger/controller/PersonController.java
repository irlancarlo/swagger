package com.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Api annotation swagger - custom name api rest
@Api(value = "Person Endpoint", description = "Descricao", tags = {"person tag"})
@RestController
@RequestMapping("/person")
public class PersonController {

    // @ApiOperation annotation - custom name action api rest
    @ApiOperation(value = "Find All")
    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok("irlan");
    }

}
