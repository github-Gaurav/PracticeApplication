package com.spring.boot.learning.LearningAppDemo.resource;

import com.spring.boot.learning.LearningAppDemo.model.Admin;
import com.spring.boot.learning.LearningAppDemo.service.AdminService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/register")
public class AdminResource {

    AdminService adminService;

    public AdminResource(AdminService adminService) {
        this.adminService = adminService;
    }


    @PutMapping
    public Mono<Admin> register(@RequestBody Admin admin){
       return adminService.register(admin);
    }
}
