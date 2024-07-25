package com.ust.DriverService.feign;

import com.ust.DriverService.client.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "BookingService" ,url = "http://localhost:9101/booking")
public interface BookingClient {

    @GetMapping("/getAllBooking")
    public List<Booking> getAllBooking();
}
