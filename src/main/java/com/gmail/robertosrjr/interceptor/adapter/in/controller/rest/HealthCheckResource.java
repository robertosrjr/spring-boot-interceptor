package com.gmail.robertosrjr.interceptor.adapter.in.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckResource {

    @GetMapping(value = "/healthcheck")
    public String getHealthCheck(){
        return "200 ok";
    }
}
