import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ReservationService reservationService(){
        return new ReservationService(roomService());
    }

    @Bean
    public RoomService roomService(){
        return new RoomService();
    }
}
