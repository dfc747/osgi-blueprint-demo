package org.example.blueprint.common;

import java.util.List;

public interface BookingService {

    List<Booking> list();

    Booking get(Long id);

    void add(Booking booking);
}
