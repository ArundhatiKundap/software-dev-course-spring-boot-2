package com.example.mycollections.models;

public class Movie extends LibraryItem{
    private String director;
    private float runtime;
    public Movie(String name, String director, int year, float runtime) {
        super(name, year);
        this.director = director;
        this.runtime=runtime;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getRuntime() {
        return runtime;
    }

    public void setTracks(float runtime) {
        this.runtime = runtime;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", runtime=" + runtime +
                " hours}";
    }
}
