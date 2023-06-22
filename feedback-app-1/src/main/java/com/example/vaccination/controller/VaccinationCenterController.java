package com.example.vaccination.controller;

import com.example.vaccination.model.VaccineCenter;
import com.example.vaccination.service.VaccineCenterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

    private final VaccineCenterService vaccineCenterService;

    public VaccinationCenterController(VaccineCenterService vaccineCenterService) {
        this.vaccineCenterService = vaccineCenterService;
    }

    // Other methods

    @PutMapping("/{id}")
    public ResponseEntity<VaccineCenter> updateVaccinationCenter(
            @PathVariable("id") Long id,
            @RequestBody VaccineCenter updatedVaccinationCenter
    ) {
        VaccineCenter vaccinationCenter = vaccineCenterService.getVaccineCenterById(id);
        if (vaccinationCenter == null) {
            return ResponseEntity.notFound().build();
        }

        vaccinationCenter.setName(updatedVaccinationCenter.getName());
        vaccinationCenter.setCity(updatedVaccinationCenter.getCity());

        VaccineCenter updatedCenter = vaccineCenterService.updateVaccineCenter(vaccinationCenter);

        return ResponseEntity.ok(updatedCenter);
    }
}
