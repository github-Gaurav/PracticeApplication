package com.spring.boot.learning.LearningAppDemo.repository;

import com.spring.boot.learning.LearningAppDemo.model.Admin;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AdminRepository extends ReactiveMongoRepository<Admin, ObjectId> {

    Mono<Admin> save(Admin admin);
}
