package com.agencetravaux.app;

import com.agencetravaux.entity.Artisan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecuteApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // je récupère mes beans
        Artisan artisan = context.getBean("metallier", Artisan.class);
        Artisan artisan1 = context.getBean("verrier", Artisan.class);

        System.out.println(artisan.decoupe());
        System.out.println("Je suis un métallier et " + artisan.faireUnDevis());

        System.out.println(artisan1.decoupe());
        System.out.println("Je suis un verrier et " + artisan.faireUnDevis());

        context.close();
    }
}
