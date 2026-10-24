package com.braindribbler.main.services;

import org.springframework.stereotype.Service;

import com.braindribbler.main.models.SiteLink;

import java.util.Arrays;
import java.util.List;

@Service
public class PortalService {

        public List<SiteLink> getSubdomains() {
                return Arrays.asList(
                                new SiteLink("Games", "https://games.braindribbler.com",
                                                "Live scorekeeping tools for card games like Rummy and Spades."),
                                new SiteLink("Recipes", "https://recipe.braindribbler.com",
                                                "A friction-free kitchen companion for meal planning and smart pantry matching."),
                                new SiteLink("Applied Jobs Log", "https://apply.braindribbler.com",
                                                "A tailored tracking registry to manage corporate job submissions and application lifecycles."));
        }
}
