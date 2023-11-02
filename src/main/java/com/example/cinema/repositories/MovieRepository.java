package com.example.cinema.repositories;

import com.example.cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    //First <>, insert the ID
    //Second<>, describe the ID


} //Last curly bracket
