package com.ust.UserService.feign;

import com.ust.UserService.client.Booking;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "bookingservice" ,url = "http://localhost:9101/booking")
    public interface BookingClient {
        @PostMapping("/addBooking")
        public Booking addBooking(@RequestBody Booking booking);
    }

