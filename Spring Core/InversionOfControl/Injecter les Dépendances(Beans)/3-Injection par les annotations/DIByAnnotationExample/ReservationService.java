package DIByAnnotationExample;


import org.springframework.stereotype.Component;

// Pour que notre bean soit reconnu par le @ComponentScan, on doit annoter notre bean par @Component
@Component
public class ReservationService {

    RoomService roomService;

    // L'injection de dépendance est transparente avec cette méthode
    public ReservationService(RoomService roomService){
        this.roomService = roomService;
    }

    public int getRoomNumber(){
        return roomService.getRoomNumber();
    }

}
