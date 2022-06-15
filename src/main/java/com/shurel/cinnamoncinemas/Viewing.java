package com.shurel.cinnamoncinemas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Viewing {
    Movie movie;
    Room room;
    LocalDateTime time;

    public Viewing(Movie movie, Room room, LocalDateTime time) {
        this.movie = movie;
        this.room = room;
        this.time = time;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public LocalDate getDate() {
        return time.toLocalDate();
    }
}
