package DIByAnnotation;

import DIByAnnotation.ApplicationConfig;
import DIByAnnotation.ReservationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIByAnnotation {

    public static void main(String[] args){
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ReservationService reservationService = (ReservationService) appCtxt.getBean(ReservationService.class);
        int roomNumber = reservationService.getRoomNumber();
        System.out.println("Hello World depuis la chambre "+roomNumber+" grace une DI par Annotation sur une propriété");
    }
}
