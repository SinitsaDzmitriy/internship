package edu.sam.aveng.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @RequestMapping(method=GET)
    public String statistics() {
        return "statistics";
    }

}