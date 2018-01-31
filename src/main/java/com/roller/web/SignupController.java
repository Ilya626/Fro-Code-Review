package com.roller.web;

import com.roller.domain.Player;
import com.roller.service.PlayerRepository;
import com.roller.viewModels.PlayerForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.validation.Valid;

@Controller
public class SignupController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/signup")
    public String player(Model model) {
        model.addAttribute("form", new PlayerForm());
        return "signup";
    }

    @PostMapping("/signup")
    public String player(@Valid PlayerForm playerForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup";
        }
        else {
            Player player = new Player(playerForm.getEmail(), playerForm.getUsername(), playerForm.getPassword());
            playerRepository.save(player);
            return "redirect:/login";
        }
    }

}


