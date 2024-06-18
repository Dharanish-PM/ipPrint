package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @GetMapping("/printIp")
    public String printIp(HttpServletRequest request) {
        String clientIp = request.getRemoteAddr();
        return "Request received from IP: " + clientIp;
    }
}
