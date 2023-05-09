package service;

import entity.Medical;

public interface MedicalService {
    Medical newMedical();

    void findMedical(Medical medical);
}
