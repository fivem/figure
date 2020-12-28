package com.iscow.figure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/is-cow")
public class FigureController {
    @GetMapping("/figure/{num}")
    public String figure(@PathVariable("num") Integer num){
        return num + " figured hook";
    }
}
