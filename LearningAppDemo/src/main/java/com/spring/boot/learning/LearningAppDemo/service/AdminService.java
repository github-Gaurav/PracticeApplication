package com.spring.boot.learning.LearningAppDemo.service;

import com.spring.boot.learning.LearningAppDemo.model.Admin;
import com.spring.boot.learning.LearningAppDemo.repository.AdminRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Mono<Admin> register(Admin admin){
        return adminRepository.save(admin);
    }
}
