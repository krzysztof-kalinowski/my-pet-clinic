package kkalinowski.springframework.kkpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}
