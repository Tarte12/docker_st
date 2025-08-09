package com.blog;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String content;
    LocalDateTime createdAt = LocalDateTime.now();

}
