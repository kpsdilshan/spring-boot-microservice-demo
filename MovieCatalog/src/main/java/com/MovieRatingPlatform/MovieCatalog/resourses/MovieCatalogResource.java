package com.MovieRatingPlatform.MovieCatalog.resourses;


import com.MovieRatingPlatform.MovieCatalog.models.Movie;
import com.MovieRatingPlatform.MovieCatalog.models.MovieCatalog;
import com.MovieRatingPlatform.MovieCatalog.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Implemented by KPS Dilshan
 */
@RestController
@RequestMapping("/movieCatalog")
public class MovieCatalogResource {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;



    @RequestMapping("/{id}")
    public List<MovieCatalog> getCatalog(@PathVariable String id){



        //get all rated movie Ids
        UserRating ratings = restTemplate.getForObject("http://movie-rating-date/ratingData/user/"+id, UserRating.class);

        return ratings.getUserRating().stream().map(rating -> {

            /*
             * for each movie id, call info service service and get details
             * this is done by Rest Template(asynchronous)
             */
            Movie movie = restTemplate.getForObject("http://movie-info/movie/"+rating.getMovieId(), Movie.class);


            //put them all together
            return new MovieCatalog(movie.getName(),"good",rating.getRating());
        })
                .collect(Collectors.toList());


/*
 *           This is done by Web Client
 */

//            Movie movie = webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8081/movie/"+rating.getMovieId())
//                    .retrieve()
//                    .bodyToMono(Movie.class)
//                    .block();


    }
}
