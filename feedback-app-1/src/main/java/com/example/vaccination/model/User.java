package com.example.vaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private int dosesTaken;
    private String vaccinationStatus;
    private Long vaccinationCenterId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDosesTaken() {
		return dosesTaken;
	}
	public void setDosesTaken(int dosesTaken) {
		this.dosesTaken = dosesTaken;
	}
	public String getVaccinationStatus() {
		return vaccinationStatus;
	}
	public void setVaccinationStatus(String vaccinationStatus) {
		this.vaccinationStatus = vaccinationStatus;
	}
	public Long getVaccinationCenterId() {
		return vaccinationCenterId;
	}
	public void setVaccinationCenterId(Long vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

    // Getters and setters
}
