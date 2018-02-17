package guru.springframework.didemo.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    // without @Qualifier is injected the Primary bean
    // without @Primary is injected the greetingServiceImpl bean
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
