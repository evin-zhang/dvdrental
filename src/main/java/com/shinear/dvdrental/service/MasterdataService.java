package com.shinear.dvdrental.service;

import java.util.List;

import com.shinear.dvdrental.controller.staff.resource.CategoryResource;
import com.shinear.dvdrental.controller.staff.resource.LanguageResource;

public interface MasterdataService {
	List<LanguageResource>   findAllLanguages();

	List<CategoryResource>   findAllCategories(); 
    
}
