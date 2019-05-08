package com.ioay.javasamples.examples.compositiondbsample.main;

import com.ioay.javasamples.examples.compositiondbsample.model.Category;
import com.ioay.javasamples.examples.compositiondbsample.model.Director;
import com.ioay.javasamples.examples.compositiondbsample.model.Movie;

public class CompositionDbMain {

    public static void main(String args[]) {

        Category category = new Category(1, "Comedy");
        Director director = new Director(1, "Christopher Nolan");

        Movie movie = new Movie(1, "Interstellar", 2014, category, director);

        System.out.println(movie.getDirector().getDirectorName());
        System.out.println(movie.getMovieName());


    }
}
