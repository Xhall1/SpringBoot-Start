package com.xl.holamundospring;

import com.xl.holamundospring.domain.Person;
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


        /* PERSON CLASS FROM DOMAIN */
        var person = new Person();
        person.setName("Juan");
        person.setSurname("Perez");
        person.setEmail("jperez@gmail.com");
        person.setPhone("+91123456789");

        log.info("running the controller Spring MVC");
        model.addAttribute("message", message);
        model.addAttribute("greetings", greetings);
        model.addAttribute("person", person); // Sharing person key, and object
        return "index";
    }
}
