package com.example.vaccination.repository;

import com.example.vaccination.model.VaccineCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineCenterRepository extends JpaRepository<VaccineCenter, Long> {
}
