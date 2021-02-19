package ru.otus.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.homework.dto.Response;


@RestController
public class HealthController {

    @GetMapping("/health")
    public Response getStatus() {
        return new Response("OK");
    }

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }
}
