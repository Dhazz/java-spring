package MultipleDIByConstructorExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultipleDependencyInjectionByConstructorExample {

    public static void main(String[] args){
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ReservationService reservationService = (ReservationService) appCtxt.getBean(ReservationService.class);
        int roomNumber = reservationService.getRoomNumber();
        System.out.println("Hello World depuis la chambre "+roomNumber+" à l'étage n°"+reservationService.getFloorNumber(roomNumber));
    }
}
