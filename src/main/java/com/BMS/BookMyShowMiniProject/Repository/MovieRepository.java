package com.BMS.BookMyShowMiniProject.Repository;

import com.BMS.BookMyShowMiniProject.Model.Movie;
import com.BMS.BookMyShowMiniProject.Model.Theatre;
import com.BMS.BookMyShowMiniProject.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class MovieRepository {

    @Autowired
    MovieService movieService;

    List<Theatre> Theatres = movieService.getTheatres();


    public void addMovie(Movie movie, String TheatreName){
        Theatre T = null;
        for(int i = 0 ; i < Theatres.size() ; i++){
            if(Theatres.get(i).getName().equals(TheatreName)){
                T = Theatres.get(i);
                break;
            }
        }
        T.getMovieNames().add(movie);

    }



}
