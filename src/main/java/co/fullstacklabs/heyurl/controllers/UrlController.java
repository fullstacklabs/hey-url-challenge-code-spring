package co.fullstacklabs.heyurl.controllers;

import co.fullstacklabs.heyurl.entities.Url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class UrlController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("urls", List.of(
            new Url("AACDC", "https://example.com/"),
            new Url("ALGJH", "https://example.org/")
        ));
        return "index";
    }
}
