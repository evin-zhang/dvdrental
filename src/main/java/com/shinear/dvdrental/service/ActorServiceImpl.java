package com.shinear.dvdrental.service;

import java.util.List;

import javax.transaction.Transactional;

import com.shinear.dvdrental.controller.customer.resource.ActorResource;

import org.springframework.stereotype.Service;
@Service("actorService")
@Transactional
public class ActorServiceImpl implements ActorService {

    @Override
    public List<ActorResource> search(String query) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
