package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Artist;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArtistService {

    private List<Artist> artistList = Arrays.asList(new Artist("george", 24), new Artist("florin", 25), new Artist("mihai", 25));

    public List<Artist> getArtists() {
        return artistList;
    }
}
