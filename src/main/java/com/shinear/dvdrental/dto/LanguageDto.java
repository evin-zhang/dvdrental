package com.shinear.dvdrental.controller.staff.resource;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class LanguageResource {
    private Integer id;
    private String name;
    private LocalDateTime updatedAt;
}
