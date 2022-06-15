package com.shurel.cinnamoncinemas;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name="noname";
    private final List<Row> rows = new ArrayList<>();
    private final List<Seat> seats = new ArrayList<>();
    private int lastBookedSeat=0;


    public Room(){
        Row row = null;
        String id = "ABC";
        for (int i = 1; i <= 3; i++) {

            row = new Row(id.charAt(i) + "");

            for (int j = 1; j <= getSeatPerRow(); j++) {
                Seat seat=new Seat(i*j,j+""+id.charAt(j));
                row.addSeat(seat);
                seats.add(seat);
            }
            rows.add(row);

        }

    }
    public String getName() {
        return name;
    }

    public int getSeatCount() {
        return seats.size();
    }

    public List<Row> getRows() {
        return rows;
    }

    public int getSeatPerRow() {
        return 5;
    }

    public Ticket allocateSeat(int nr){
        Seat seat=getSeat(nr);
        seat.allocate(true);
      return seat.isAllocated()?new Ticket(seat):null;
    }

    private Seat getSeat(int nr) {
        return seats.stream().filter(s->s.getNumber()==nr).findAny().get();
    }
}
