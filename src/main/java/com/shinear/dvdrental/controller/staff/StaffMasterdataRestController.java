package com.shinear.dvdrental.controller.staff;

import java.util.List;

import com.shinear.dvdrental.controller.staff.resource.CategoryResource;
import com.shinear.dvdrental.controller.staff.resource.LanguageResource;
import com.shinear.dvdrental.service.MasterdataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/staff/masterdatas")
@Api(tags="masterdata")
public class StaffMasterdataRestController {
    @Autowired
    @Qualifier("masterdataService")
    private MasterdataService masterdataService;
    
    /**
     * Language master acquisition
     * @return
     */
    @GetMapping("/languages")
    @ApiOperation(value = "Language master acquisition", nickname = "staff_get_languages")
    public List<LanguageResource> getLanguages(){
            return masterdataService.findAllLanguages();
    }
    /**
     * Get category master
     * @return
     */
    @GetMapping("/categories")
    @ApiOperation(value="Get category master", nickname = "staff_get_categories")
        public List<CategoryResource> getCategories(){
            return masterdataService.findAllCategories();
        }
}
