package com.ust.ManagerService.service;

import com.ust.ManagerService.client.Booking;
import com.ust.ManagerService.feign.BookingClient;
import com.ust.ManagerService.model.Manager;
import com.ust.ManagerService.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private BookingClient bookingClient;

    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    public Manager findById(Long id) {
        return managerRepository.findById(id).orElse(null);
    }
    public Manager save(Manager manager) {
        return managerRepository.save(manager);
    }

    public Booking confirmBooking(Long id) {
        Booking booking = bookingClient.getBookingById(id);
        booking.setStatus("Confirmed");
        return bookingClient.changeStatus(booking);
    }
}
