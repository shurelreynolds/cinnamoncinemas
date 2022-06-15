package com.shurel.cinnamoncinemas;

public class Movie {
    private String name;
    private int durationMins;
    private boolean soldOut;

    public Movie(String name, int durationMins) {
        this.name = name;

        this.durationMins = durationMins;
    }

    public String getName() {
        return name;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldout(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
