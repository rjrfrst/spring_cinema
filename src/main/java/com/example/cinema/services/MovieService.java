package com.example.cinema.services;

import com.example.cinema.models.Movie;
import com.example.cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    //Create method to publish/add movies
    public Movie addMovie(Movie movie){
        movieRepository.save(movie); //.save is like an add for an array list
        return movie;
    }

    //Updates the movie on top of the first movie, to create a new movie
    public Optional<Movie> getMovie(long id){
        return movieRepository.findById(id);
    }

    //Updates the movies in the database
    public List<Movie> getPublishedMovies(){
        return movieRepository.findAll();
    }



}//Last curly bracket
