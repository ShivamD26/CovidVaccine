package com.example.covidvaccine.model;

public class VaccineModel {

    private String vaccineCenter;
    private String vaccineCharges;
    private String vaccineAge;
    private String vaccineTimings;
    private String vaccineName;
    private String vaccineAddress;
    private String vaccineAvailable;
    private String vaccineCenterTime;

    public VaccineModel() {
    }

    public String getVaccineCenter() {
        return vaccineCenter;
    }

    public void setVaccineCenter(String vaccineCenter) {
        this.vaccineCenter = vaccineCenter;
    }

    public String getVaccineCharges() {
        return vaccineCharges;
    }

    public void setVaccineCharges(String vaccineCharges) {
        this.vaccineCharges = vaccineCharges;
    }

    public String getVaccineAge() {
        return vaccineAge;
    }

    public void setVaccineAge(String vaccineAge) {
        this.vaccineAge = vaccineAge;
    }

    public String getVaccineTimings() {
        return vaccineTimings;
    }

    public void setVaccineTimings(String vaccineTimings) {
        this.vaccineTimings = vaccineTimings;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineAddress() {
        return vaccineAddress;
    }

    public void setVaccineAddress(String vaccineAddress) {
        this.vaccineAddress = vaccineAddress;
    }

    public String getVaccineAvailable() {
        return vaccineAvailable;
    }

    public void setVaccineAvailable(String vaccineAvailable) {
        this.vaccineAvailable = vaccineAvailable;
    }

    public String getVaccineCenterTime() {
        return vaccineCenterTime;
    }

    public void setVaccineCenterTime(String vaccineCenterTime) {
        this.vaccineCenterTime = vaccineCenterTime;
    }

    public VaccineModel(String vaccineCenter, String vaccineCharges, String vaccineAge, String vaccineTimings, String vaccineName, String vaccineAddress, String vaccineAvailable, String vaccineCenterTime) {
        this.vaccineCenter = vaccineCenter;
        this.vaccineCharges = vaccineCharges;
        this.vaccineAge = vaccineAge;
        this.vaccineTimings = vaccineTimings;
        this.vaccineName = vaccineName;
        this.vaccineAddress = vaccineAddress;
        this.vaccineAvailable = vaccineAvailable;
        this.vaccineCenterTime = vaccineCenterTime;
    }
}
