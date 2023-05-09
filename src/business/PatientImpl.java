package business;

import entity.Patient;
import service.PatientService;

import java.util.Scanner;

public class PatientImpl implements PatientService {

    @Override
    public Patient newPatient() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        String pid = input.nextLine();
        System.out.print("name:-");
        String pname = input.nextLine();
        System.out.print("disease:-");
        String disease = input.nextLine();
        System.out.print("sex:-");
        String sex = input.nextLine();
        System.out.print("admit_status:-");
        String admit_status = input.nextLine();
        System.out.print("age:-");
        int age = input.nextInt();
        return new Patient(pid, pname, disease, sex, admit_status, age);
    }

    public void patientInfo(Patient patient) {
        System.out.println(patient.getPid() + "\t" + patient.getPname() + " \t" + patient.getDisease() + "     \t" + patient.getSex() + "      \t" + patient.getAdmitStatus() + "\t" + patient.getAge());
    }
}
