package com.ust.ManagerService.controller;

import com.ust.ManagerService.client.Booking;
import com.ust.ManagerService.model.Manager;
import com.ust.ManagerService.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")

public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/addManager")
    public ResponseEntity<Manager> addManager(@RequestBody Manager manager) {
        return ResponseEntity.ok(managerService.save(manager));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Manager>> getAll() {
        return ResponseEntity.ok(managerService.findAll());
    }

    @GetMapping("getManager/{id}")

    public ResponseEntity<Manager> getManager(@PathVariable Long id) {
        return ResponseEntity.ok(managerService.findById(id));
    }

    @GetMapping("confirmBooking/{id}")
    public ResponseEntity<Booking> confirmBooking(@PathVariable Long id) {
        return ResponseEntity.ok(managerService.confirmBooking(id));
    }

}
