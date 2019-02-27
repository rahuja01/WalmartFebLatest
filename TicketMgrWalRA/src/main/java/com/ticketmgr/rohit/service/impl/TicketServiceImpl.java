package com.ticketmgr.rohit.service.impl;

import com.ticketmgr.rohit.Utility.Utilities;
import com.ticketmgr.rohit.model.Seat;
import com.ticketmgr.rohit.model.SeatHold;
import com.ticketmgr.rohit.model.SeatReserved;
import com.ticketmgr.rohit.model.SeatStatus;
import com.ticketmgr.rohit.repository.RepositoryVenue;
import com.ticketmgr.rohit.repository.impl.RepositoryImpl;
import com.ticketmgr.rohit.service.TicketService;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.*;

@Service
public class TicketServiceImpl implements TicketService {

    int timeOut = 40;

    @Autowired
    RepositoryVenue repositoryVenue;

    public TicketServiceImpl(RepositoryImpl repositoryVenue) {
        this.repositoryVenue = repositoryVenue;
    }

    @Override
    public int numSeatsAvailable() {
        return repositoryVenue.getAvailableSeats();
    }

    @Override
    public synchronized SeatHold findAndHoldSeats(int numSeats, String customerEmail) {

        List<Seat> seatlst = new ArrayList<>();

        if (numSeats > numSeatsAvailable()) {
            System.out.println("Number of Seats requested are not available, Please try with a lesser number");
            return null;
        } else {
            String primaryId = Utilities.createID();
            SeatHold seatHold = new SeatHold(customerEmail);
            seatHold.setId(primaryId);
            seatHold.setNumSeats(numSeats);

            // Get Seats that are available
            // @Todo ask for number for seats, Email ID.
            // either hold all of the seats or some of them.

            seatlst = repositoryVenue.getSeatsAvailable(numSeats);
            if (seatlst != null) {

                repositoryVenue.addSeats(seatlst);
            }

            // Save Seats in repo
            repositoryVenue.saveSeatHold(seatHold);
            seatHold.setSeatsLst(seatlst);

            return seatHold;

        }

    }

    @Override
    public String reserveSeats(int seatHoldId, String customerEmail) {

        {
            String uniqueID = "";
            SeatHold seatHold = repositoryVenue.findSeatHold(seatHoldId);

            if (seatHold != null && customerEmail.equals(seatHold.getCustomerEmail())) {

                for (Seat seat : seatHold.getSeatsLst()) {
                    seat.setStatus(SeatStatus.HELD);
                }

                SeatReserved seatReserved = new SeatReserved(seatHold);
                repositoryVenue.saveBooking(seatReserved);

                String zeros = "000000";
                Random rnd = new Random();
                String str = Integer.toString(rnd.nextInt(0X1000000), 16);
                str = zeros.substring(str.length()) + str;

                uniqueID = str;

            }

            return uniqueID;
        }
    }


}
