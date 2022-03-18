package com.vanoa.sfgdi;

import com.vanoa.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        //bean names are class name with starting with lowercase
        MyController controller = (MyController) ctx.getBean("myController");

        String greeting = controller.sayHello();

        System.out.println(greeting);
    }

}
