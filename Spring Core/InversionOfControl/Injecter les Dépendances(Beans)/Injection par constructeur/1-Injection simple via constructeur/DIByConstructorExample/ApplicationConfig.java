package DIByConstructorExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    // Dans la classe de configuration on renseigne les dépendances dans les constructeurs:
    // Ici on va injecter le bean RoomService (spécifié en dessous) dans le bean ReservationService
    @Bean
    public ReservationService reservationService(){
        return new ReservationService(roomService());
    }

    @Bean
    public RoomService roomService(){
        return new RoomService();
    }
}
