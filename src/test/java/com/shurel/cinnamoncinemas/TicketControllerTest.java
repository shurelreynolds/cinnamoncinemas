package com.shurel.cinnamoncinemas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


public class TicketControllerTest {
    TicketController controller = null;

    @Before
    public void setup() {
        controller = new TicketController();
    }

    @Test
    public void testSeatsAvailable() {
        Integer expected = 15;
        Assert.assertEquals(expected, controller.getAvailableSeats());


        try {
            int nr= (int) (Math.random() * 3 + 1);
            controller.allocateSeats(nr);
            expected-=nr;
            Assert.assertEquals(expected, controller.getAvailableSeats());

        } catch (TicketException e) {
            e.printStackTrace();
        }
       }
}
