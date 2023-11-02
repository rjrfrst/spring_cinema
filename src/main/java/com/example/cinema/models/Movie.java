package com.example.cinema.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    //properties
    //Create a unique identifier
    @Id //Becomes the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private String rating;

    @Column(name = "duration")
    private int duration;

    //Constructor
    public Movie(String inputTitle, String inputRating){
        this.title = inputTitle;
        this.rating = inputRating;
    }

    //Default constructor
    public Movie() {
    }

    //Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //


} //Last curly bracket
