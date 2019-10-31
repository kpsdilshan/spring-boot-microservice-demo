package com.MovieRatingPlatform.MovieCatelog.resources;

import com.MovieRatingPlatform.MovieCatelog.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{id}")
    public List<CatalogItem> getCatalog(@PathVariable  String userId){
        return Collections.singletonList(
                new CatalogItem("Supun","good",5)
        );
    }
}
