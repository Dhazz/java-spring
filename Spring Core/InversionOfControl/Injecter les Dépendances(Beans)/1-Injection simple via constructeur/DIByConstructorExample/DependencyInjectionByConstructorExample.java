package DIByConstructorExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionByConstructorExample {

    public static void main(String[] args){
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ReservationService reservationService = (ReservationService) appCtxt.getBean(ReservationService.class);
        System.out.println("Hello World depuis la chambre "+reservationService.getRoomNumber());
    }
}
