package com.maksuta.patterns.creational.builder;

import java.util.Date;

public abstract class AbstractBuilder {
    
    abstract void buildDay(Date date);
    abstract void addHotel(Date date, String hotel);
    abstract void addReservation(Date date, Venue venue);
    abstract void addSpecialEvent(String event);
    abstract void addTickets(Date date, Venue venue, int noOfTickets);
    abstract Planner getPlanner();

}
