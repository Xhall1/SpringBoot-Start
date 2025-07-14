package com.xl.holamundospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(){
        log.info("running the controller Spring MVC");
        return "index";
    }
}
