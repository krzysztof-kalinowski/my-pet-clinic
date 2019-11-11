package kkalinowski.springframework.kkpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

@Controller
public class VetController {

    @RequestMapping({"/vets/", "/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
