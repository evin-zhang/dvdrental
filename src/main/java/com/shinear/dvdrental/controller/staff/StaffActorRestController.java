package com.shinear.dvdrental.controller.staff;

import java.util.List;

import com.shinear.dvdrental.controller.customer.resource.ActorResource;
import com.shinear.dvdrental.service.ActorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1/staff/actors")
@Api(tags = "actor")
public class StaffActorRestController {
    @Autowired
    @Qualifier("actorService")
    private ActorService actorService;
    /**
     * staff search actors
     * @param query
     * @return
     */
    @GetMapping("search")
    @ApiOperation(value="Actor Search",nickname = "staff_search_actors")
    public List<ActorResource> search(
        @RequestParam String query
    ){
        return actorService.search(query);
    }
}
