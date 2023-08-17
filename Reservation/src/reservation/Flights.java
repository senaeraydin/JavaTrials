package reservation;

public class Flights {
    private int flightNUmber;
    private String customerName;
    private String customerSurname;
    private String date;
    private int numberOfPassengers;
    private double flightPrice;

    public Flights(int flightNUmber, String customerName, String customerSurname, String date, int numberOfPassengers, double flightPrice) {
        this.flightNUmber = flightNUmber;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.date = date;
        this.numberOfPassengers = numberOfPassengers;
        this.flightPrice = flightPrice;
    }

    public int getFlightNUmber() {
        return flightNUmber;
    }

    public void setFlightNUmber(int flightNUmber) {
        this.flightNUmber = flightNUmber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }
}
