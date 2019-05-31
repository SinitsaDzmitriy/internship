package edu.sam.aveng.web;

import edu.sam.aveng.entities.UserDictionaryCard;
import edu.sam.aveng.service.UserDictionaryCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/mydictionary")
public class MyDictionaryController {

    @Autowired
    UserDictionaryCardService service;

    @RequestMapping(method = RequestMethod.GET)
    public String myDictionary(ModelMap model) {

        List<UserDictionaryCard> cards = service.findAllUserDictionaryCards();
        model.addAttribute("cards", cards);
        return "mydictionary";

    }

    @RequestMapping(value = { "/edit-{phrase}-employee" }, method = RequestMethod.GET)
    public String editEmployee(@PathVariable String phrase, ModelMap model) {
        UserDictionaryCard employee = service.findUserDictionaryCardByPhraseInEnglish(phrase);
        model.addAttribute("employee", employee);
        model.addAttribute("edit", true);
        return "registration";
    }

    @RequestMapping(value = { "/edit-{phrase}-card" }, method = RequestMethod.POST)
    public String updateEmployee(UserDictionaryCard card, ModelMap model, @PathVariable String phrase) {

        service.updateUserDictionaryCard(card);

        model.addAttribute("success", "Card " + card.getPhraseInEnglish()	+ " updated successfully");
        return "success";
    }

    @RequestMapping(value = { "/delete-{phrase}-employee" }, method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable String phrase) {
        service.deleteUserDictionaryCardByPhraseInEnglish(phrase);
        return "redirect:/mydictionary";
    }

}
