package com.maksuta.patterns.creational.builder;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Builder extends AbstractBuilder {

    private Planner vacationPlanner;

    public Builder() {
        this.vacationPlanner = new Planner();
    }

    @Override
    void buildDay(Date date) {
        this.vacationPlanner.getDates().add(date);
    }

    @Override
    void addHotel(Date date, String hotel) {
        Map<Date, List<String>> hotels = this.vacationPlanner.getHotels();
        List<String> hotelsList = new LinkedList<>();
        if (hotels.containsKey(date)) {
            hotelsList = hotels.get(date);
            hotelsList.add(hotel);
        } else {
            hotelsList.add(hotel);
            hotels.put(date, hotelsList);
        }
    }

    @Override
    void addReservation(Date date, Venue venue) {
        Map<Date, List<Venue>> reservations = this.vacationPlanner.getReservations();
        List<Venue> venuesList = new LinkedList<>();
        if (reservations.containsKey(date)) {
            venuesList = reservations.get(date);
            venuesList.add(venue);
        } else {
            venuesList.add(venue);
            reservations.put(date, venuesList);
        }

    }

    @Override
    void addSpecialEvent(String event) {
        List<String> specialEvents = this.vacationPlanner.getSpecialEvents();
        specialEvents.add(event);
    }

    @Override
    void addTickets(Date date, Venue venue, int noOfTickets) {
        Map<Date, Map<Venue, Integer>> tickets = this.vacationPlanner.getTickets();
        Map<Venue, Integer> venueList = new HashMap<>();
        if (tickets.containsKey(date)) {
            venueList = tickets.get(date);
            if (venueList.containsKey(venue)) {
                Integer ticketCount = venueList.get(tickets);
                ticketCount += noOfTickets;
                venueList.put(venue, ticketCount);
            } else {
                venueList.put(venue, noOfTickets);
                tickets.put(date, venueList);
            }
        } else {
            venueList.put(venue, noOfTickets);
            tickets.put(date, venueList);
        }
    }

    @Override
    Planner getPlanner() {
        return this.vacationPlanner;
    }

}