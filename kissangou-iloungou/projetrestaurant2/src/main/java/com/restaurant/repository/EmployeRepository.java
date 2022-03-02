package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
