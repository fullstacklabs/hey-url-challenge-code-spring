package co.fullstacklabs.heyurl.controllers;

import co.fullstacklabs.heyurl.entities.Url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class UrlController {
    @GetMapping("/")
    public String index(Model model) {
        // TODO: load 10 most recent URLs from the DB
        model.addAttribute("urls", Arrays.asList(
            new Url("AACDC", "https://example.com/"),
            new Url("ALGJH", "https://example.org/")
        ));
        return "index";
    }

    @GetMapping("/{id}")
    public RedirectView redirect(@PathVariable String id) {
        // TODO: load the requested URL from the DB and return the right redirect
        // TODO: return a nice 404 error page if the requested URL doesn't exist
        // TODO: record click stats before redirecting
        return new RedirectView("https://example.com/" + id);
    }

    @GetMapping("/{id}/stats")
    public String stats(@PathVariable String id, Model model) {
        // TODO: load the requested URL and its stats from the DB

        model.addAttribute("url", new Url(id, "https://example.com/"));

        Map<String, Integer> daily_clicks = new LinkedHashMap<>();
        model.addAttribute("daily_clicks", daily_clicks);
        daily_clicks.put("1", 13);
        daily_clicks.put("2", 2);
        daily_clicks.put("3", 1);
        daily_clicks.put("4", 7);
        daily_clicks.put("5", 20);
        daily_clicks.put("6", 18);
        daily_clicks.put("7", 10);
        daily_clicks.put("8", 20);
        daily_clicks.put("9", 15);
        daily_clicks.put("10", 5);

        Map<String, Integer> browsers_clicks = new LinkedHashMap<>();
        model.addAttribute("browsers_clicks", browsers_clicks);
        browsers_clicks.put("IE", 13);
        browsers_clicks.put("Firefox", 22);
        browsers_clicks.put("Chrome", 17);
        browsers_clicks.put("Safari", 7);

        Map<String, Integer> platform_clicks = new LinkedHashMap<>();
        model.addAttribute("platform_clicks", platform_clicks);
        platform_clicks.put("Windows", 13);
        platform_clicks.put("macOS", 22);
        platform_clicks.put("Ubuntu", 17);
        platform_clicks.put("Other", 7);

        return "stats";
    }
}
