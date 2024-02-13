package com.davymbaimbai.zimhotel.response;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;
    private Blob photo;

    private List<BookingResponse> bookings;
}
