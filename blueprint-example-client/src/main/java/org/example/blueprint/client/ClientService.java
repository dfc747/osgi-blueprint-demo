package org.example.blueprint.client;

import java.util.List;

import org.example.blueprint.common.Booking;

public interface ClientService {

    List<Booking> bookings();

    void addBooking(Booking booking);

}
