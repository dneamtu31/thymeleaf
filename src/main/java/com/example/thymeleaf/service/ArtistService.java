package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Artist;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArtistService {


    public List<Artist> getArtists() {
        return Arrays.asList(new Artist("george", 24), new Artist("florin", 25), new Artist("mihai", 25));
    }
}
