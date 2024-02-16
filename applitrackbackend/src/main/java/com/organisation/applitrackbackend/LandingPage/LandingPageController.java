package com.organisation.applitrackbackend.LandingPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LandingPageController {
    @GetMapping("/")
    public String landing_page()
    {
        return "This is the landing page. I will use react for the new landing page";
    }
}
