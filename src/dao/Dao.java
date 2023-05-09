package dao;

import entity.*;

import java.util.ArrayList;

public class Dao extends EntityListDao {
    public String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public Dao(ArrayList<Doctor> doctors, ArrayList<Facility> facilities, ArrayList<Lab> labs, ArrayList<Patient> patients, ArrayList<Medical> medicals, ArrayList<Staff> staffs) {
        super(doctors, facilities, labs, patients, medicals, staffs);
    }

    public void addList() {
        Doctor doctor = new Doctor("21", "dsada", "sdasdas", "sdasdasd", "sasf", 5);
        doctors.add(doctor);
        doctors.add(doctor);
        doctors.add(doctor);
        doctors.add(doctor);
        doctors.add(doctor);

        Facility facility = new Facility("Ambulance");
        facilities.add(facility);
        facilities.add(facility);
        facilities.add(facility);

        Lab lab = new Lab("Mr", 20);
        labs.add(lab);
        labs.add(lab);
        labs.add(lab);

        Patient patient = new Patient("12", "sadas", "dasdas", "male", "sadas", 22);
        patients.add(patient);
        patients.add(patient);

        Medical medical = new Medical("asdas", "sadasd", "sadsadas", 20, 50);
        medicals.add(medical);
        medicals.add(medical);
        medicals.add(medical);

        Staff staff = new Staff("231", "ATAŞ", "nurse", "male", 120);
        staffs.add(staff);
        staffs.add(staff);
    }
}
