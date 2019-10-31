package com.MovieRatingPlatform.MovieCatelog.model;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class CatalogItem  {

    private String name;
    private String description;
    private int rating;


    public CatalogItem(String name,String description,int rating){
        this.name=name;
        this.description=description;
        this.rating=rating;
    }
}
