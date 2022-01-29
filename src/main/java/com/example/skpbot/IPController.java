package com.example.skpbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IPController {

    @Autowired
    IPService ipService;

    @GetMapping("/ip")
    public String getIP(HttpServletRequest request)
    {
        String ip = request.getRemoteAddr();
        System.out.println(ip);
        return ip;
    }

    @GetMapping("/ip_details/{ip}")
    public String getIPDetails(@PathVariable String ip)
    {
        String details = ipService.getDetails(ip);
        return details;
    }
}
