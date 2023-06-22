package com.example.vaccination.service.impl;

import com.example.vaccination.model.VaccineCenter;
import com.example.vaccination.repository.VaccineCenterRepository;
import com.example.vaccination.service.VaccineCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineCenterServiceImpl implements VaccineCenterService {

    private final VaccineCenterRepository vaccineCenterRepository;

    @Autowired
    public VaccineCenterServiceImpl(VaccineCenterRepository vaccineCenterRepository) {
        this.vaccineCenterRepository = vaccineCenterRepository;
    }

    @Override
    public List<VaccineCenter> getAllVaccineCenters() {
        return vaccineCenterRepository.findAll();
    }

    @Override
    public VaccineCenter getVaccineCenterById(Long id) {
        return vaccineCenterRepository.findById(id).orElse(null);
    }

    @Override
    public VaccineCenter saveVaccineCenter(VaccineCenter vaccineCenter) {
        return vaccineCenterRepository.save(vaccineCenter);
    }

    @Override
    public void deleteVaccineCenter(Long id) {
        vaccineCenterRepository.deleteById(id);
    }

	@Override
	public VaccineCenter updateVaccineCenter(VaccineCenter vaccineCenter) {
		// TODO Auto-generated method stub
		return null;
	}
}
