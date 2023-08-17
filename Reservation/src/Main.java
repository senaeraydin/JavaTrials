import reservation.TravelReservation;

public class Main {
    public static void main(String[] args)
    {
        TravelReservation reservation = new TravelReservation();
        reservation.searchFlights(1234, "16-08-2023", 200,2.333);
        reservation.searchAccommodations("Kitty", "London",2500);
        reservation.bookFlight(1234,"John",
                "Brytan", "16-08-2023", 200, 2.333);
        reservation.bookAccommodation("Kitty", "Jessy","London",
                "25-08-23", "30-08-23", 12500);
        reservation.bookFlight(234,"Elly",
                "Marison", "29-09-2023", 250, 2.689);
        reservation.cancelFlightReservation(234);
    }
}