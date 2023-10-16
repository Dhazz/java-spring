package DIByAnnotationExample;

import org.springframework.stereotype.Component;

// Pour que notre bean soit reconnu par le @ComponentScan, on doit annoter notre bean par @Component
@Component
public class RoomService {

    private int roomNumber = 1408;

    public int getRoomNumber() {
        return roomNumber;
    }



}
