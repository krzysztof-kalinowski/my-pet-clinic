package kkalinowski.springframework.kkpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/", "/owners/index", "/owners/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
