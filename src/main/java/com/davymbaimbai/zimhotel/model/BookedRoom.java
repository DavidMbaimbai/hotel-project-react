package com.davymbaimbai.zimhotel.model;

import java.time.LocalDate;

public class BookedRoom {
    private Long bookingId;
    private LocalDate checkInDate;

    private LocalDate checkOutDate;
    private String guestFullName;

    private String guestEmail;

    private int numberOfAdults;
    private int numberOfChildren;
    private int totalNumberOfGuest;

    private String bookingConfirmationCode;

    private Room room;

    public void calculateTotalNumberOfGuests(){
        this.totalNumberOfGuest = this.numberOfAdults + this.numberOfChildren;
    }
    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
        calculateTotalNumberOfGuests();
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
        calculateTotalNumberOfGuests();
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
