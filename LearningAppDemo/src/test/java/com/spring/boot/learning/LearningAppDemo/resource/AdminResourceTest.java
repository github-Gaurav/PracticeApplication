package com.spring.boot.learning.LearningAppDemo.resource;

import com.spring.boot.learning.LearningAppDemo.model.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient
@SpringBootTest
public class AdminResourceTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void adminTest(){
        Admin admin = new Admin();
        admin.setName("Gaurav");
        admin.setPassword("test");
        webTestClient.put()
                .uri("/api/register")
                .bodyValue(admin)
                .exchange()
                .expectStatus().isOk()
                .expectBody(Admin.class);
    }

}
