package service;

import entity.Patient;

public interface PatientService {
    Patient newPatient();

    void patientInfo(Patient patient);
}
