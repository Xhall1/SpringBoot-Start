package com.xl.holamundospring;

import com.xl.holamundospring.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;


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

        var person2 = new Person();
        person2.setName("Karla");
        person2.setSurname("Gomez");
        person2.setEmail("kgomez@gmail.com");
        person2.setPhone("+91987654321");

//        var persons = new ArrayList();
//        persons.add(person);
//        persons.add(person2);

        var persons = Arrays.asList(person, person2);
//
//        var persons = new ArrayList();


        log.info("running the controller Spring MVC");
        model.addAttribute("message", message);
        model.addAttribute("greetings", greetings);
//        model.addAttribute("person", person); // Sharing person key, and object

        model.addAttribute("persons", persons);
        return "index";
    }
}
