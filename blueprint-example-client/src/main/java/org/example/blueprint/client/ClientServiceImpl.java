package org.example.blueprint.client;

import java.util.List;

import org.example.blueprint.common.Booking;
import org.example.blueprint.common.BookingService;

public class ClientServiceImpl implements ClientService {

    private BookingService bookingService;

    @Override
    public List<Booking> bookings() {
        return bookingService.list();
    }

    @Override
    public void addBooking(Booking booking) {
        bookingService.add(booking);
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }
}
