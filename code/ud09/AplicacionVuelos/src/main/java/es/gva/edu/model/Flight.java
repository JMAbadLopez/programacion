package es.gva.edu.model;

import java.time.LocalDate;

public class Flight {

    private String numFlight;
    private String destination;
    private LocalDate departure;
    private int duration;

    public Flight() {
    }
    public Flight(String flightNumber, String destination, LocalDate departureDate, int duration) {
        this.numFlight = flightNumber;
        this.destination = destination;
        this.departure = departureDate;
        this.duration = duration;
    }

    public String getNumFlight() {
        return this.numFlight;
    }

    public void setNumFlight(String flightNumber) {
        this.numFlight = flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public LocalDate getDeparture() {
        return this.departure;
    }

    public void setDeparture(LocalDate departureDate) {
        this.departure = departureDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.numFlight + " " + this.destination + " " + this.departure + " " + this.duration;
    }

}
