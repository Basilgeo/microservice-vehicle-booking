package com.ust.UserService.service;

import com.ust.UserService.client.Booking;
import com.ust.UserService.feign.BookingClient;
import com.ust.UserService.model.User;
import com.ust.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookingClient bookingClient;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Booking bookAppointment(Booking booking){
        booking.setStatus("pending");
        return  bookingClient.addBooking(booking);
    }


}
