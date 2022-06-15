package com.shurel.cinnamoncinemas;

import java.util.ArrayList;
import java.util.List;

class Row {
    private final String name;
    private List<Seat> seats =  new ArrayList<>();

    public Row(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }
}
