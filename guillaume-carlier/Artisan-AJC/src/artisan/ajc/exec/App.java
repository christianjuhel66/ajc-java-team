package artisan.ajc.exec;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import artisan.ajc.entities.Artisan;

public class App {

	public static void main(String[] args) {
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Artisan menuisier = context.getBean("menuisier", Artisan.class);
        Artisan couvreur = context.getBean("couvreur", Artisan.class);
        Artisan macon = context.getBean("macon", Artisan.class);

        System.out.println(menuisier.decouper());
        System.out.println("Je suis un menuisier et " + menuisier.faireDevis());

        System.out.println(couvreur.decouper());
        System.out.println("Je suis un couvreur et " + couvreur.faireDevis());
        
        System.out.println(macon.decouper());
        System.out.println("Je suis un macon et " + macon.faireDevis());

        context.close();
    }

}
