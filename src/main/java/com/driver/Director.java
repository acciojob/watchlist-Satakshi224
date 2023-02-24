package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
    private int imdbRating;

  public Director(){

  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public int getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(int imdbRating) {
        this.imdbRating = imdbRating;
    }


    public Director(String name, int numberOfMovies, int imdbRating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imdbRating;
    }



}
