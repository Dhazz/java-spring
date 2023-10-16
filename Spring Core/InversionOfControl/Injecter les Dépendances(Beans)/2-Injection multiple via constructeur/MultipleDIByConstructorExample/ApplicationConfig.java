package MultipleDIByConstructorExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    // Même principe que pour l'injection simple vu avant mais cette fois-ci notre bean a besoin de 2 dépendances, le
    // constructeur est donc configuré en conséquences

    // On peut également observer une cascade des dépendances: ReservationService -> FloorService -> FloorRepository
    @Bean
    public ReservationService reservationService(){
        return new ReservationService(roomService(), floorService(floorRepository()));
    }

    @Bean
    public RoomService roomService(){
        return new RoomService();
    }

    @Bean
    public FloorService floorService(FloorRepository floorRepository){ return new FloorService(floorRepository);}

    @Bean
    public FloorRepository floorRepository(){ return new FloorRepository();}


}
