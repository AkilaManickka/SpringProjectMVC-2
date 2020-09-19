package com.example.demo.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.Model.Event;
import com.example.demo.Model.User;
import com.example.demo.service.EventService;



public class EventValidator implements Validator {
	
    @Autowired
    private EventService eventService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
    	Event event = (Event) o;
    }

}
