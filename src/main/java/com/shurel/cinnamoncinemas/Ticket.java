package com.shurel.cinnamoncinemas;

public class Ticket {

    private Seat seat;

    public Ticket(Seat seat) {

        this.seat = seat;
    }

    public String getCode(){
        return seat.getCode();
    }

    @Override
    public String toString(){
        return getCode();
    }
}
