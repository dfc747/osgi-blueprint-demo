package org.example.blueprint.common;

import java.util.Random;

public class Booking {
    private Long id;

    private String customer;
    private String flight;

    public Booking(String customer, String flight) throws Exception {
        this.id = new Random().nextLong();
        this.customer = customer;
        this.flight = flight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
}
