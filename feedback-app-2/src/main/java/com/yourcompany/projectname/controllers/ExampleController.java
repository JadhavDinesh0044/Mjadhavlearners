package com.yourcompany.projectname.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/public")
    public String publicPage() {
        // Handle public page request
        return "public";
    }

    @GetMapping("/private")
    public String privatePage() {
        // Handle private page request
        return "private";
    }
}
