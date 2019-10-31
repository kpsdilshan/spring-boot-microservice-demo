package com.MovieRatingPlatform.MovieCatalog.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieCatalog {

    private String name;
    private String description;
    private int rating;


    public MovieCatalog(){ }

    public MovieCatalog(String name,String description,int rating){
        this.name = name;
        this.description = description;;
        this.rating = rating;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
}
