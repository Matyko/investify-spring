package com.futurebillionaires.codecool.investify.Controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/registration", "/about"})
    public String index() {
        return "index";
    }
}
