package DIByAnnotation;

import DIByAnnotation.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Pour que notre bean soit reconnu par le @ComponentScan, on doit annoter notre bean par @Component
@Component
public class ReservationService {

    @Autowired
    RoomService roomService;

    // @Autowired se base sur le type du bean. L'injection de dépendance est transparente avec cette méthode

    public int getRoomNumber(){
        return roomService.getRoomNumber();
    }

}
