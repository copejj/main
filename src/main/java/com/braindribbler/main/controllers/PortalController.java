package com.braindribbler.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.braindribbler.main.services.PortalService;

@Controller
public class PortalController {

    private final PortalService portalService;

    public PortalController(PortalService portalService) {
        this.portalService = portalService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("sites", portalService.getSubdomains());
        return "index";
    }
}
