package com.BMS.BookMyShowMiniProject.Service;

import com.BMS.BookMyShowMiniProject.Model.Screen;
import com.BMS.BookMyShowMiniProject.Model.Theatre;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class MovieService {
    private List<Theatre> Theatres;

    public MovieService(List<Theatre> theatres) {
        Theatres = theatres;
    }

    Screen s0 = new Screen("Main screen",200);
    Screen s1 = new Screen("Screen 1",155);
    Screen s2 = new Screen("Screen 2", 100);
    Screen s3 = new Screen("Screen 3",50);

    Theatre carnival = new Theatre("carnivalCinemas","Kollam",3);
    Theatre Gmax = new Theatre("Gmax","Kollam",2);
    Theatre Revathy = new Theatre("Revathy","Paripally",4);


    public void add(){
        Theatres.add(carnival);
        Theatres.add(Gmax);
        Theatres.add(Revathy);
    }
    public List<Theatre> getTheatres(){
        return Theatres;
    }

    public void carnivalScreens(){
        List<Screen> screenNames = carnival.getScreenNames();
        screenNames.add(s1);
        screenNames.add(s2);
        screenNames.add(s3);
        carnival.setScreenNames(screenNames);
    }

    public void GmaxScreens(){
        List<Screen> screenNames = Gmax.getScreenNames();
        screenNames.add(s0);
        screenNames.add(s1);
        screenNames.add(s2);
        Gmax.setScreenNames(screenNames);
    }

    public  void RevathyScreens(){
        List<Screen> screenNames = Revathy.getScreenNames();
        screenNames.add(s0);
        screenNames.add(s1);
        screenNames.add(s2);
        screenNames.add(s3);
        Revathy.setScreenNames(screenNames);
    }
}
