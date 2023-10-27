package SpringBootBasic;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String sendHello(){
        return "Hello World!";
    }
}
