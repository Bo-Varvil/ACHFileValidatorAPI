package com.groupg.achfilevalidator.services;

import com.groupg.achfilevalidator.models.ValidationResponse;
import com.groupg.achfilevalidator.services.validation.ACHValidator;
import com.groupg.achfilevalidator.services.validation.StandardACHValidator;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.InputStreamSource;
import org.springframework.stereotype.Service;

/**
 * CURRENT DEPENDENCY INJECTION NAME IS DEFAULT
 */
@Service("validationService")
public class ValidationServiceImpl implements ValidationService{

    @Autowired
    @Qualifier("standardValidation")
    StandardACHValidator standardValidator;

    @Override
    public ArrayList<ValidationResponse> validate(InputStreamSource file) {
        standardValidator.validateFile(file);
        return null;
    }

}