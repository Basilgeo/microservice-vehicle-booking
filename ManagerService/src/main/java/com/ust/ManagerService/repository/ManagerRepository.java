package com.ust.ManagerService.repository;

import com.ust.ManagerService.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
