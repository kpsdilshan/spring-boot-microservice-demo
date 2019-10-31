package com.MovieRatingPlatform.MovieInRatingData.modeles;
import lombok.Getter;
import lombok.Setter;

/*
 * Implemented by KPS Dilshan
 */
@Setter
@Getter
public class Rating {

    private String movieId;
    private int rating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
