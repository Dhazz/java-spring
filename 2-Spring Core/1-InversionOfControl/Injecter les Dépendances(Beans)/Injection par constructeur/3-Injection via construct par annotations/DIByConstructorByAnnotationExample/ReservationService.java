package DIByConstructorByAnnotationExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Pour que notre bean soit reconnu par le @ComponentScan, on doit annoter notre bean par @Component
@Component
public class ReservationService {

    RoomService roomService;

    // @Autowired se base sur le type du bean. L'injection de dépendance est transparente avec cette méthode
    @Autowired // @Autowired est optionnel s'il n'y a qu'un constructeur (dans cet exemple, c'est superflu)
    public ReservationService(RoomService roomService){
        this.roomService = roomService;
    }

    public int getRoomNumber(){
        return roomService.getRoomNumber();
    }

}
