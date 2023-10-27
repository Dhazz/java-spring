package SpringBootBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;
    public void sayHello(){
        System.out.println(helloRepository.sendHello());
    }
}
