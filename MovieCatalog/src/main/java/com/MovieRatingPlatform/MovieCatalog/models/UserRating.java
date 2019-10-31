package com.MovieRatingPlatform.MovieCatalog.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserRating {
    private List<Rating> userRating;


}
