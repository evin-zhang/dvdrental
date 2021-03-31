package com.shinear.dvdrental.controller.sysadmin;

import com.shinear.dvdrental.service.SysadminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/sysadmin")
@Api(tags = "sysadmin")
public class SysadminRestController {
    @Autowired
    @Qualifier("sysadminService")
    private SysadminService sysadminService;
    /**
     * Initialize login id and password for cusotmer and staff
     */
    @PostMapping("/init-all-loginid-and-password")
    @ApiOperation(value="Initialize login id and password for cusotmer and staff", nickname = "init-all-loginid-and-password")
    public void initAllLoginIdAndPassword(){
        sysadminService.initAllLoginIdAndPassword();

    }
    /**
     * Index to movie ElasticSearch
     */
    @PostMapping("index-to-elasticsearch")
    @ApiOperation(value="Index to movie ElasticSearch", nickname = "index_films_to_elasticsearch")
    public void indexToElasticSearch(){
        sysadminService.indexToElasticSearch();
    }
}
