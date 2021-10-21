package org.example.blueprint.provider.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.blueprint.common.Booking;
import org.example.blueprint.common.BookingService;

public class BookingServiceImpl implements BookingService {

    private final Map<Long, Booking> bookingMap = new HashMap<>();

    @Override
    public List<Booking> list() {
        return new ArrayList<>(bookingMap.values());
    }

    @Override
    public Booking get(Long id) {
        return bookingMap.get(id);
    }

    @Override
    public void add(Booking booking) {
        bookingMap.put(booking.getId(), booking);
    }
}
