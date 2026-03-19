package com.kauabiscotto.CinemaSystem;

public class Movie {

    private String title;
    private int duration;
    private MovieGenre genre;
    private int classificationIndicate;


    public Movie (String title, int duration, MovieGenre genre, int classificationIndicate) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.classificationIndicate = classificationIndicate;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getClassificationIndicate() {
        return classificationIndicate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setClassificationIndicate(int classificationIndicate) {
        this.classificationIndicate = classificationIndicate;
    }

    @Override
    public String toString() {
        return "FMovie: " + title +
                " | Duration: " + duration + " min" +
                " | Genre: " + genre +
                " | Classification: " + classificationIndicate + " years";
    }

}
