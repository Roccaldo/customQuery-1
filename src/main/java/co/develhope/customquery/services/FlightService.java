package co.develhope.customquery.services;

import co.develhope.customquery.entities.Flight;
import co.develhope.customquery.enums.Status;
import co.develhope.customquery.repositories.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    FlightRepo flightRepo;

    public List<Flight> createFlights() {
        List<Flight> flightList = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription("This is the flight number: " + i);
            flight.setFromAirport("From Airport: " + random.nextInt(10));
            flight.setToAirport("To Airport: " + random.nextInt(10));
            flight.setStatus(Status.ONTIME);
            flightList.add(flight);
        }
        return flightRepo.saveAll(flightList);
    }

    public List<Flight> findAll() {
        return flightRepo.findAll();
    }
}
