package com.example.aravind_pt1748.recyclerviewapp102;

/**
 * Created by aravind-pt1748 on 26/03/18.
 */

public class Game {

    private String title;
    private String genre;
    private String year;
    public Game(String title,String genre,String year){
        this.title=title;
        this.genre=genre;
        this.year=year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
