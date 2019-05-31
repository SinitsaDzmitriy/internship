package edu.sam.aveng.web;

import edu.sam.aveng.entities.UserDictionaryCard;
import edu.sam.aveng.service.UserDictionaryCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/card"})
public class CardController {

    @Autowired
    UserDictionaryCardService service;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(ModelMap model) {

        UserDictionaryCard card = new UserDictionaryCard();
        model.addAttribute("card", card);
        model.addAttribute("edit", false);
        return "add_new_card";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveUserDictionaryCard(UserDictionaryCard card, ModelMap model) {

        service.saveUserDictionaryCard(card);

        model.addAttribute("message", "Card " + card.getPhraseInEnglish() + " added successfully");
        return "response";
    }

}
