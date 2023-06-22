package com.example.vaccination.service;

import com.example.vaccination.model.VaccineCenter;

import java.util.List;

public interface VaccineCenterService {
    List<VaccineCenter> getAllVaccineCenters();
    VaccineCenter getVaccineCenterById(Long id);
    VaccineCenter saveVaccineCenter(VaccineCenter vaccineCenter);
    VaccineCenter updateVaccineCenter(VaccineCenter vaccineCenter);
    void deleteVaccineCenter(Long id);
}
