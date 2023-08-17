package reservation;

import java.util.ArrayList;

public class TravelReservation {

    private ArrayList<Flights> flights;
    private ArrayList<Accommodation> accommodations;

    public TravelReservation() {
        this.flights = new ArrayList<Flights>();
        this.accommodations = new ArrayList<Accommodation>();
    }

    public void searchFlights(int flightNumber, String date,
                              int numberOfPassengers, double flightPrice) {
        System.out.println("Flight number: " + flightNumber + "\n"+
                "Date: " + date + "\n" + "Number of passengers: " +
                numberOfPassengers +" \n"+ "Price: " + flightPrice);
    }

    public void searchAccommodations(String accommodationName,
                                     String location, double accommodationPrice) {
        System.out.println("Accommodation Name: " + accommodationName+" \n" +
                "Location of Accommodation: " + location +" \n"+ "Price: " +
                accommodationPrice);
    }

    public void bookFlight(int flightNumber, String customerName,
                           String customerSurname, String date,
                           int numberOfPassengers, double flightPrice) {
        Flights flight = new Flights(flightNumber, customerName, customerSurname,
                date, numberOfPassengers, flightPrice);
        this.flights.add(flight);
        System.out.println("You booked a flight. Your flight informations: \n");
        System.out.println("Flight number: " + flightNumber +" \n"+ " Customer Name: " + customerName +" \n"+ "Customer Surname: " + customerSurname +" \n"+
                "Date: " + date);
    }

    public void bookAccommodation(String accommodationName, String customerName,
                                  String location, String checkInDate, String checkOutDate,
                                  double accommodationPrice) {
        Accommodation accommodation = new Accommodation(accommodationName, customerName, location, checkInDate, checkOutDate, accommodationPrice);
        this.accommodations.add(accommodation);
        System.out.println("You booked a accommodation. Your reservations informations: \n");
        System.out.println("Accommodation Name: " + accommodationName + " Location: " + location + "Check In Date:  " + checkInDate +
                "Check Out Date: " + checkOutDate + "Accommodation Price: " + accommodationPrice);
    }

    public void cancelFlightReservation(int flightNumber) {
        // Cancel a flight or hotel reservation based on confirmation number
        for (Flights flight : this.flights) {
            if (flight.getFlightNUmber() == flightNumber) {
                this.flights.remove(flight);
                System.out.println("Your flight reservation is cancelled.");
                return;
            }
        }
    }
}