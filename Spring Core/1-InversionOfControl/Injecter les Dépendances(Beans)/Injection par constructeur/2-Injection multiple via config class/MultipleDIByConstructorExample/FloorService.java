package MultipleDIByConstructorExample;

public class FloorService {

    FloorRepository floorRepository;
    public FloorService(FloorRepository floorRepository){
        this.floorRepository = floorRepository;
    }

    public int getFloor(int room){
        return floorRepository.getFloorByRoomNumber(room);
    }
}
