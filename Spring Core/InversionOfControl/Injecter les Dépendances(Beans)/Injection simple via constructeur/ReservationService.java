public class ReservationService {

    RoomService roomService;
    public ReservationService(RoomService roomService){
        this.roomService = roomService;
    }

    public int getRoomNumber(){
        return roomService.getRoomNumber();
    }
}
