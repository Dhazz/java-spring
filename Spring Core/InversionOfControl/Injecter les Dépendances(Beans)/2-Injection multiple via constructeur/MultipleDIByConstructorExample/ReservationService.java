package MultipleDIByConstructorExample;

public class ReservationService {

    RoomService roomService;

    FloorService floorService;

    public ReservationService(RoomService roomService, FloorService floorService){
        this.roomService = roomService;
        this.floorService = floorService;
    }

    public int getRoomNumber(){
        return roomService.getRoomNumber();
    }

    public int getFloorNumber(int roomNumber) {return floorService.getFloor(roomNumber);}
}
