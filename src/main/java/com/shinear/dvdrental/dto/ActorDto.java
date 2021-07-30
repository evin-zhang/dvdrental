package com.shinear.dvdrental.controller.customer.resource;

import lombok.Data;

import java.util.Date;

@Data
public class ActorResource {

    private Long actorId;


    private String firstName;


    private String lastName;


    private Date lastUpdate;
}
