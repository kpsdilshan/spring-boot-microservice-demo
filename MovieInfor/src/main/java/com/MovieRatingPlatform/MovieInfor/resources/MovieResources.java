package com.MovieRatingPlatform.MovieInfor.resources;


import com.MovieRatingPlatform.MovieInfor.modeles.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Implemented by KPS Dilshan
 */
@RequestMapping("/movie")
@RestController
public class MovieResources {


    @RequestMapping("/{id}")
    public Movie getMovie(@PathVariable String id){
         return new Movie("12312","Madolduwa");
    }
}
