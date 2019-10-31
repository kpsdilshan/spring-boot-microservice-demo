package com.MovieRatingPlatform.MovieInRatingData.resources;


import com.MovieRatingPlatform.MovieInRatingData.modeles.Rating;
import com.MovieRatingPlatform.MovieInRatingData.modeles.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
 * Implemented by KPS Dilshan
 */

@RequestMapping("/ratingData")
@RestController
public class RatingDataResource {



    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String  movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("user/{userId}")
    public UserRating getRatingByUser(@PathVariable String userId){
        List<Rating> ratings =  Arrays.asList(
                new Rating("1212",4),
                new Rating("2121",5)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
