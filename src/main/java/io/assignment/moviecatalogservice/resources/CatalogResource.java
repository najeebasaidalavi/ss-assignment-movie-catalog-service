package io.assignment.moviecatalogservice.resources;

import io.assignment.moviecatalogservice.models.Movie;
import io.assignment.moviecatalogservice.models.CatalogItem;
import io.assignment.moviecatalogservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        List<CatalogItem> catalogItems = new ArrayList<>();
        ResponseEntity<List<Rating>> response = restTemplate.exchange(
                "http://ratings-data-service/ratingsdata/user/" + userId,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Rating>>() {}
        );
        List<Rating> userRating = response.getBody();
        for (Rating rating: userRating){
             Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
             catalogItems.add( new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating(), rating.getDescription()));
        }
        return catalogItems;
    }
}

/*
Alternative WebClient way
Movie movie = webClientBuilder.build().get().uri("http://localhost:8082/movies/"+ rating.getMovieId())
.retrieve().bodyToMono(Movie.class).block();
*/