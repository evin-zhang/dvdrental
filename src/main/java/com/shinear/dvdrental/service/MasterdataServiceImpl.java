package com.shinear.dvdrental.service;

import java.util.List;

import javax.transaction.Transactional;

import com.shinear.dvdrental.controller.staff.resource.CategoryResource;
import com.shinear.dvdrental.controller.staff.resource.LanguageResource;

import org.springframework.stereotype.Service;
@Transactional
@Service("masterdataService")
public class MasterdataServiceImpl implements MasterdataService {

    @Override
    public List<LanguageResource> findAllLanguages() {
        return null;
    }

    @Override
    public List<CategoryResource> findAllCategories() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
