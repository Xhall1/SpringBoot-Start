package com.xl.holamundospring.web;

import com.xl.holamundospring.dao.PersonDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControllableInitio {

    // Inject the interface
    @Autowired
    private PersonDao personDao;

    @GetMapping("/")
    public String start(Model model) {

        var persons = personDao.findAll();
        log.info("running the controller Spring MVC");
        model.addAttribute("persons", persons);
        return "index";
    }
}
