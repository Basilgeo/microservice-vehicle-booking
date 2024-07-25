package com.ust.DriverService.controller;

import com.ust.DriverService.client.Booking;
import com.ust.DriverService.model.Driver;
import com.ust.DriverService.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping("/addDrivers")
    public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(driverService.save(driver));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Driver>> findAll() {
        return ResponseEntity.ok(driverService.findAll());
    }

    @GetMapping("/getDriver/{id}")
    public ResponseEntity<Driver> getDriver(@PathVariable Long id) {
        return ResponseEntity.ok(driverService.findById(id));
    }

    @GetMapping("/getBookings/{id}")
    public ResponseEntity<List<Booking>> getBookings(@PathVariable Long id) {
        return ResponseEntity.ok(driverService.getBookingByDriverId(id));
    }
}
