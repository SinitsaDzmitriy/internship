package edu.sam.aveng.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/", "/homepage"})
public class MainController {

    // handle GET requests for /
    @RequestMapping(method=GET)
    public String home() {
        // view name
        return "main";
    }

}