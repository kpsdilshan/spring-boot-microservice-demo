package com.MovieRatingPlatform.MovieInfor.modeles;
import lombok.Getter;
import lombok.Setter;

/*
 * Implemented by KPS Dilshan
 */
@Getter
@Setter
public class Movie {
    private String movieId;
    private String name;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }
}
