package com.vanoa.sfgdi.controllers;

import com.vanoa.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
