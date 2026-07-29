package com.maksuta.patterns.creational.builder;

import java.util.Date;

public class Client {

    public static void main(String[] args) {

        Builder builder = new Builder();

        Date date = new Date();

        builder.buildDay(date);
        builder.addHotel(date, "Grand Hotel");

        Venue concertHall = new Venue("Concert Hall");

        builder.addTickets(date, concertHall, 2);

        // plan rest of vacation

        Planner yourPlanner = builder.getPlanner();

        System.out.println(yourPlanner);

    }

}
