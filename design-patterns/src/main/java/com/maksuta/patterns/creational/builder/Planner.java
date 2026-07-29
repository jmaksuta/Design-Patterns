package com.maksuta.patterns.creational.builder;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Planner {

    private List<Date> dates;
    private Map<Date, List<String>> hotels;
    private Map<Date, List<Venue>> reservations;
    private List<String> specialEvents;
    private Map<Date, Map<Venue, Integer>> tickets;

    public List<Date> getDates() {
        return dates;
    }

    public Map<Date, List<String>> getHotels() {
        return hotels;
    }

    public Map<Date, List<Venue>> getReservations() {
        return reservations;
    }

    public List<String> getSpecialEvents() {
        return specialEvents;
    }

    public Map<Date, Map<Venue, Integer>> getTickets() {
        return tickets;
    }

    public Planner() {
        super();
        this.dates = new LinkedList<>();
        this.hotels = new HashMap<>();
        this.reservations = new HashMap<>();
        this.specialEvents = new LinkedList<>();
        this.tickets = new HashMap<>();
    }

    @Override
    public String toString() {
        String result = "";
        // special events
        if (this.specialEvents.size() > 0) {
            result += String.format("Special Events: %s\n", this.specialEvents.size());
            for (String specialEvent : this.specialEvents) {
                result += String.format("%s\n", specialEvent);
            }
        }

        for (

        Date date : this.dates) {
            result += String.format("Date: %s\n", date.toString());

            List<String> hotels = this.hotels.get(date);
            result += String.format("Hotels: %d total\n", hotels.size());
            for (String hotelName : hotels) {

                result += String.format("%s\n", hotelName);
            }
            // reservations
            if (this.reservations.containsKey(date)) {
                List<Venue> reservations = this.reservations.get(date);
                
                result += String.format("Reservations: %d total\n", reservations.size());
                for (Venue venue : reservations) {

                    result += String.format("%s\n", venue.getName());
                }
            }
            // tickets
            Map<Venue, Integer> tickets = this.tickets.get(date);
            result += String.format("Tickets: %d venues\n", tickets.size());
            for (Venue venue : tickets.keySet()) {
                Integer ticketCount = tickets.get(venue);
                result += String.format("%s %d tickets confirmed.\n", venue.getName(), ticketCount);
            }
        }
        return result;
    }

}
