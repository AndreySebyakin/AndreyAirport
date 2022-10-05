package by.airport;

import by.airport.entity.*;
import by.airport.repository.*;
import by.airport.repository.impl.*;

public class AirportDemo {

    public static void main(String[] args) {

        TicketRepository ticketRepository = new TicketRepositoryImpl();
        Ticket ticketToPrint = ticketRepository.findById(5);

        System.out.println("________________________________________________________________________________________");
        System.out.println("Welcome to Andrey Airport");
        System.out.println("Ticket #: " + ticketToPrint.getTicketNumber());
        System.out.println("Flight date: " + ticketToPrint.getFlightDate());
        System.out.println("Passenger: " + ticketToPrint.getCustomerId().getCustomerName() + " " +
                ticketToPrint.getCustomerId().getCustomerSurname());
        System.out.println("Departure from: " + ticketToPrint.getRouteId().getDepartureAirportId().getAirportName() +
                ", " + ticketToPrint.getRouteId().getDepartureAirportId().getCityId().getCityName());
        System.out.println("Arrival to: " + ticketToPrint.getRouteId().getArrivalAirportId().getAirportName() + ", " +
                ticketToPrint.getRouteId().getArrivalAirportId().getCityId().getCityName());
        System.out.println("Flight cost: " + ticketToPrint.getRouteId().getCost() + " USD.");
        System.out.println("Aircompany: " + ticketToPrint.getRouteId().getAirCompanyId().getAirCompanyName());
        System.out.println("________________________________________________________________________________________");
    }
}
