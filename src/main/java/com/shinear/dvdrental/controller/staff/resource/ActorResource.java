package com.shinear.dvdrental.controller.staff.resource;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ActorResource {
    private Integer id;
    private LocalDateTime updatedAt;
    private String firstName;
    private String lastName;
    private String fullName;
}
