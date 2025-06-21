package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/movies")

public class MovieController {
    private final List<Movie> movies = new ArrayList<>() {{
                new Movie("3 Idiots", "Rajkumar Hirani", 2009, 2.51f);
                new Movie("Dangal", "Nitesh Tiwari", 2016, 2.41f);
                new Movie("Zindagi Na Milegi Dobara", "Zoya Akhtar", 2011, 2.53f);
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
                movieList +
                """
                        </ul>
                    </body>
                """;
    }


}
