package com.ioay.javasamples.examples.compositiondbsample.model;

public class Movie {

    private int movieId;
    private String movieName;
    private int movieYear;
    private Category category;
    private Movie movie;

    public Movie() {
    }

    public Movie(int movieId, String movieName, int movieYear, Category category, Movie movie) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.category = category;
        this.movie = movie;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
