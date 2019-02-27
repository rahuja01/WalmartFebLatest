package com.ticketmgr.rohit.repo;

import com.ticketmgr.rohit.Utility.Utilities;
import com.ticketmgr.rohit.model.Seat;
import com.ticketmgr.rohit.model.SeatHold;
import com.ticketmgr.rohit.model.SeatReserved;
import com.ticketmgr.rohit.model.SeatStatus;
import com.ticketmgr.rohit.repository.RepositoryVenue;
import com.ticketmgr.rohit.repository.impl.RepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class RepoVenueTests {

    RepositoryVenue repositoryVenue;
    final int NUM_OF_SEATS = 44;
    final String EMAIL = "rahuja@gmail.com";

    @Before
    public void setUp() {
        repositoryVenue = new RepositoryImpl(NUM_OF_SEATS);
    }

    @Test
    public void generatesCorrectNumberOfSeats() {
        assertEquals(NUM_OF_SEATS, repositoryVenue.getAvailableSeats());
    }

    @Test
    public void savesSeatHold() {
        Seat seat = new Seat();
        List<Seat> lst = new ArrayList<>();
        seat.setStatus(SeatStatus.HELD);
        lst.add(seat);
        SeatHold seatHold = new SeatHold(EMAIL);
        String primaryId = Utilities.createID();
        seatHold.setId(primaryId);
        seatHold.setSeatsLst(lst);

        repositoryVenue.saveSeatHold(seatHold);

        assertEquals(seatHold, repositoryVenue.findSeatHold(Integer.parseInt(seatHold.getId())));
    }


    @Test
    public void savesBooking() {
        Seat seat = new Seat();
        List<Seat> lst = new ArrayList<>();
        seat.setStatus(SeatStatus.HELD);
        lst.add(seat);
        SeatHold seatHold = new SeatHold(EMAIL);
        String primaryId = Utilities.createID();
        seatHold.setId(primaryId);
        seatHold.setSeatsLst(lst);
        repositoryVenue.saveSeatHold(seatHold);
        SeatReserved seatReserved = new SeatReserved(seatHold);

        repositoryVenue.saveBooking(seatReserved);

    }

    @Test
    public void generatesReservationCode() {
        Seat seat = new Seat();
        List<Seat> lst = new ArrayList<>();
        seat.setStatus(SeatStatus.HELD);
        lst.add(seat);
        SeatHold seatHold = new SeatHold(EMAIL);
        String primaryId = Utilities.createID();
        seatHold.setId(primaryId);
        seatHold.setSeatsLst(lst);
        repositoryVenue.saveSeatHold(seatHold);
        SeatReserved seatReserved = new SeatReserved(seatHold);
        assertNull(seatReserved.getId());

        repositoryVenue.saveBooking(seatReserved);

        assertNotNull(seatReserved.getId());
    }

    @Test
    public void generatesSeatHoldId() {
        SeatHold seatHold = new SeatHold(EMAIL);
        String primaryId = Utilities.createID();
        seatHold.setId(primaryId);
        assertEquals(1, Integer.parseInt(seatHold.getId()));

        repositoryVenue.saveSeatHold(seatHold);

        assertNotEquals(0, Integer.parseInt(seatHold.getId()));
    }



}

