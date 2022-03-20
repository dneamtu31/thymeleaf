package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Artist;
import com.example.thymeleaf.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ArtistsController {

    @Autowired
    private ArtistService artistService;

    @RequestMapping(value = "/artists", method = RequestMethod.GET)
    public String getArtists(Model model) {
        List<Artist> artists = artistService.getArtists();

        model.addAttribute("artists", artists);
        return "artists-v3";
    }
}
