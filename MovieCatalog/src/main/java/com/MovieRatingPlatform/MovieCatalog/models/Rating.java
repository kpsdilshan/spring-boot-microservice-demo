package com.MovieRatingPlatform.MovieCatalog.models;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Rating {

    private String movieId;
    private int rating;

    public Rating() { }

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
