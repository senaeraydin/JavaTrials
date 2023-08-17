package reservation;

public class Accommodation {
    private String accommodationName;
    private String customerName;
    private String location;
    private String checkInDate;
    private String checkOutDate;
    private double accommodationPrice;

    public Accommodation(String accommodationName, String customerName, String location, String checkInDate, String checkOutDate, double accommodationPrice) {
        this.accommodationName = accommodationName;
        this.location = location;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.accommodationPrice = accommodationPrice;
        this.customerName = customerName;
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getAccommodationPrice() {
        return accommodationPrice;
    }

    public void setAccommodationPrice(double accommodationPrice) {
        this.accommodationPrice = accommodationPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
