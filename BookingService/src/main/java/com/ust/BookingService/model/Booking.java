package com.ust.BookingService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {

    @Id
    private Long id;
    private Long userId;
    private Long driverId;
    private String date;
    private String status;
}
