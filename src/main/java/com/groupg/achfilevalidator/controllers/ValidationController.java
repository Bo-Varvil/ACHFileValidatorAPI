package com.groupg.achfilevalidator.controllers;

import com.groupg.achfilevalidator.models.ValidationResponse;
import com.groupg.achfilevalidator.services.ValidationService;
import com.groupg.achfilevalidator.services.ValidationServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.InputStreamSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/file/validate")
@RestController
public class ValidationController{

    @Autowired
    @Qualifier("validationService")
    private ValidationServiceImpl validationService;

    @PostMapping
    public List<ValidationResponse> validateFile(@RequestParam("file") InputStreamSource file){
        return validationService.validate(file);
        
        //TODO API RESPONSE
    }
}