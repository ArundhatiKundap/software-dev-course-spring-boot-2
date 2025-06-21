package com.example.mycollections.controllers;
import com.example.mycollections.models.Album;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("Aashiqui", "Kumar Sanu",1990 ,10 ));
        add(new Album("Dil Se", "A. R. Rahman", 1998,6));
        add(new Album("Kal Ho Naa Ho", "Sonu Nigam",2003,8 ));
    }};

    @GetMapping("/json")
    public List<Album> getBooksJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

            return """
                    <html>
                        <body>
                            <h1>Albums</h1>
                            <ul>
                    """ +

                    albumList
                    +
                    """
                                    </ul>
                                </body>
                            """;

    }
}
