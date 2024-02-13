package com.davymbaimbai.zimhotel.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @Column(name = "check_in")
    private LocalDate checkInDate;
    @Column(name = "check_out")
    private LocalDate checkOutDate;
    @Column(name = "guest_fullname")
    private String guestFullName;
    @Column(name = "guest_email")
    private String guestEmail;
    @Column(name = "adults")
    private int numberOfAdults;
    @Column(name = "childern")
    private int numberOfChildren;
    private int totalNumberOfGuest;
    @Column(name = "confirmation_code")
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
