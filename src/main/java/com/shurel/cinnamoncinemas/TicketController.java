package com.shurel.cinnamoncinemas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TicketController {
    private Cinema cinema = new Cinema("Cinnamon Cinemas");
    private int lastRow = 0;
    private char lastSeat=0;
   // private int availableSeats =15;

    private String seatLabel="ABC";

    public TicketController() {

    }

    public TicketController(Cinema cinema) {
        this.cinema = cinema;
    }

    public Ticket[] allocateSeats(String movieTitle, Room room, int count, LocalDateTime time) throws TicketException {
        int i=cinema.seatsAvailable(room,movieTitle, time);

        if(cinema.getRoomForMovie("New Movie", LocalDate.now()).getSeatCount()==soldSeats) throw new TicketException("No Seats Available");

        if(availableSeats<count)throw new TicketException("Not Enough Seats Available");

        if(count<=0 || count >3)throw new TicketException("Ticket count out of range");

availableSeats-=count;


        return null;
    }

    public Integer getAllocatedSeats() {
        return null;
    }

    public Integer getAvailableSeats() {

        return availableSeats;
    }

    private boolean canBook(Integer ticketCount) {
        return false;
    }
}
