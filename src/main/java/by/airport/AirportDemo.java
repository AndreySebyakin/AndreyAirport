package by.airport;

import by.airport.entity.*;
import by.airport.repository.*;
import by.airport.repository.impl.*;

import java.util.List;

public class AirportDemo {

    public static void main(String[] args) {

        TicketRepository ticketRepository = new TicketRepositoryImpl();
        Ticket ticketToPrint = ticketRepository.findById(5);

        System.out.println("Welcome to Andrey Airport");
        System.out.println("Ticket #: " + ticketToPrint.getTicketNumber());
        System.out.println("Flight date: " + ticketToPrint.getFlightDate());
        System.out.println("Departure from: " + ticketToPrint.getRoteId().getDepartureAirportId().getAirportName() + ", " +
                ticketToPrint.getRoteId().getDepartureAirportId().getCityId().getCityName());
        System.out.println("Arrival to: " + ticketToPrint.getRoteId().getArrivalAirportId().getAirportName() + ", " +
                ticketToPrint.getRoteId().getArrivalAirportId().getCityId().getCityName());
        System.out.println("Flight cost: " + ticketToPrint.getRoteId().getCost());
        System.out.println("Aircompany: " + ticketToPrint.getRoteId().getAirCompanyId().getAirCompanyName());
    }
}
