package DIByConstructorExample;

public class ReservationService {

    RoomService roomService;

    // Pour que l'injection par constructeur fonctionne il faut donc bien définir le constructeur dans le bean qui a besoin des dépendances
    // d'autres beans
    public ReservationService(RoomService roomService){
        this.roomService = roomService;
    }

    public int getRoomNumber(){
        return roomService.getRoomNumber();
    }
}
