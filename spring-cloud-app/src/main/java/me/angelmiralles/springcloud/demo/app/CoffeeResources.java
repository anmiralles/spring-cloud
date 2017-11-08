package me.angelmiralles.springcloud.demo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeResources {

    @RequestMapping(value = "/coffee")
    public String coffee(){
        return "media luna";
    }
}
