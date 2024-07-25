package com.ust.DriverService.client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Booking {

    private Long id;
    private Long userId;
    private Long driverId;
    private String date;
    private String status;
}
