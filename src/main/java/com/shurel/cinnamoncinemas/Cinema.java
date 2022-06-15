package com.shurel.cinnamoncinemas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cinema {
    private List<Viewing> viewingList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();
    private String name;

    public Cinema(String name) {
        this.name = name;
        Room room = new Room();
        Movie movie = new Movie("New Movie", 90);
        LocalDateTime time=LocalDateTime.now();
        Viewing viewing1 = new Viewing(movie, room,time );
        LocalDateTime nextTime = time.plusHours(2);
        Viewing viewing2 = new Viewing(movie, room, nextTime);
        viewingList.add(viewing1);
        viewingList.add(viewing2);
        roomList.add(room);
    }


    public String getName() {
        return name;
    }

    public List<Viewing> getViewingForMovie(String movie, LocalDateTime now) {
        return viewingList.stream().filter(m -> movie.equals(m.getMovie().getName()) && m.getDate().equals(now))
                .collect(Collectors.toList());
    }

    public int seatsAvailable(Room room,String movie,LocalDateTime now) {
        Viewing viewing=getViewingForMovie(movie,now);
return 0;
    }

    public int seatsAvailable(String movieTitle) {
    }
}


