package com.example.cinema.controllers;


import com.example.cinema.models.Movie;
import com.example.cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //This indicates a BEAN
@RequestMapping (value = "/spring_cinema") //localhost:8080/spring_cinema
public class MovieController {

    //Create following routes
    //GET /movies
    //GET /movies/{id}
    //POST /movies
    @Autowired
    MovieService movieService;

    //First route
    @PostMapping //Everytime I post a request, I can create a new movie.
    public ResponseEntity<String> newMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>(movie.getTitle(), HttpStatus.CREATED);
    }


//    Second route
    //This allows me to do localhost:8080/spring_movies/1
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Movie>> getMovieID(@PathVariable long id){
        return new ResponseEntity<>(movieService.getMovie(id), HttpStatus.OK);
    }

//    Third route
//    public ResponseEntity<List<Movie>> getPublishedMovies(){
////        List<Movie> movie = movieService.getPublishedMovies();
//        return new ResponseEntity<>(movieService.getPublishedMovies(), HttpStatus.OK);
//    }





} //last curly bracket
