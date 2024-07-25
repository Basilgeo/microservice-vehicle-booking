package com.ust.ManagerService.feign;


import com.ust.ManagerService.client.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "BookingService" ,url = "http://localhost:9101/booking")
public interface BookingClient {

    @GetMapping("/getAllBooking")
    public List<Booking> getAllBooking();

    @PostMapping("/changeStatus")
    public Booking changeStatus(@RequestBody Booking booking);

    @GetMapping("/getBookingById/{id}")
    public Booking getBookingById(@PathVariable Long id);

}