package com.vanoa.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN","default"})
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld - EN";
    }
}
