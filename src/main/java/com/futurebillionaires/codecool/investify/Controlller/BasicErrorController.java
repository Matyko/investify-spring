package com.futurebillionaires.codecool.investify.Controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicErrorController {

    @RequestMapping("/error")
    public String error() {
        return "error";
    }

}
