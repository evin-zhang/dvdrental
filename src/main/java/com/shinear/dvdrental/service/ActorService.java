package com.shinear.dvdrental.service;
import java.util.List;
import com.shinear.dvdrental.controller.customer.resource.ActorResource;
public interface ActorService{
    List<ActorResource> search(
        String query
    );
}