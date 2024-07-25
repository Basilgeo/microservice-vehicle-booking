package com.ust.BookingService.controller;

import com.ust.BookingService.model.Booking;
import com.ust.BookingService.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")

public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/addBooking")
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.save(booking));
    }


    @GetMapping("/getAllBooking")
    public ResponseEntity<List<Booking>> getAllBooking() {
        return ResponseEntity.ok(bookingService.findAll());
    }

    @GetMapping("/getBookingById/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
        return ResponseEntity.ok(bookingService.findById(id));
    }

    @PostMapping("/changeStatus")
    public ResponseEntity<Booking> changeStatus(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.save(booking));
    }
}
