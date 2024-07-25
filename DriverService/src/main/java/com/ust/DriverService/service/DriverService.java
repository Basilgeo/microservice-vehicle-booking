package com.ust.DriverService.service;

import com.ust.DriverService.client.Booking;

import com.ust.DriverService.feign.BookingClient;
import com.ust.DriverService.model.Driver;
import com.ust.DriverService.repo.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private BookingClient bookingClient;

    public List<Driver> findAll() {
        return driverRepository.findAll();
    }
    public Driver findById(Long id) {
        return driverRepository.findById(id).get();
    }
    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }

    public List<Booking> getBookingByDriverId(Long driverId) {
        return bookingClient.getAllBooking().stream().filter(e->e.getDriverId()==driverId && e.getStatus().equalsIgnoreCase("confirmed")).toList();
    }

}
