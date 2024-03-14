package co.develhope.customquery.controllers;

import co.develhope.customquery.entities.Flight;
import co.develhope.customquery.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @PostMapping("/create")
    public ResponseEntity<List<Flight>> create() {
       return ResponseEntity.ok(flightService.createFlights());
    }

    @GetMapping("all")
    public ResponseEntity<List<Flight>> findAll() {
        return ResponseEntity.ok(flightService.findAll());
    }
}
