package com.ust.ManagerService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Booking {

    private Long id;
    private Long userId;
    private Long driverId;
    private String date;
    private String status;
}
