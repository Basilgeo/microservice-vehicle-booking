package com.ust.DriverService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    @Id
    private Long id;
    private String name;
    private String email;
    private String licenseNumber;

}
