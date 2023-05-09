package dao;

import entity.*;

import java.util.ArrayList;

public class EntityListDao {
    public ArrayList<Doctor> doctors;
    public ArrayList<Facility> facilities;
    public ArrayList<Lab> labs;
    public ArrayList<Patient> patients;
    public ArrayList<Medical> medicals;
    public ArrayList<Staff> staffs;

    public EntityListDao(ArrayList<Doctor> doctors, ArrayList<Facility> facilities, ArrayList<Lab> labs, ArrayList<Patient> patients, ArrayList<Medical> medicals, ArrayList<Staff> staffs) {
        this.doctors = doctors;
        this.facilities = facilities;
        this.labs = labs;
        this.patients = patients;
        this.medicals = medicals;
        this.staffs = staffs;
    }
}
