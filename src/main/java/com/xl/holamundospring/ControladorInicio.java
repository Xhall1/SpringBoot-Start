package com.xl.holamundospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.greetings}")
    private String greetings;

    @GetMapping("/")
    public String inicio(Model model) {
        var message = "Message with Thymeleaf";
        log.info("running the controller Spring MVC");
        model.addAttribute("message", message);
        model.addAttribute("greetings", greetings);
        return "index";
    }
}
