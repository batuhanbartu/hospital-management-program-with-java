package business;

import entity.Doctor;
import service.DoctorService;

import java.util.Scanner;

public class DoctorImpl implements DoctorService {

    @Override
    public Doctor newDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        String did = input.nextLine();
        System.out.print("name:-");
        String dname = input.nextLine();
        System.out.print("specilization:-");
        String specilist = input.nextLine();
        System.out.print("work time:-");
        String appoint = input.nextLine();
        System.out.print("qualification:-");
        String doc_qual = input.nextLine();
        System.out.print("room no.:-");
        int droom = input.nextInt();
        return new Doctor(did, dname, specilist, appoint, doc_qual, droom);
    }

    @Override
    public void doctorInfo(Doctor doctor) {
        System.out.println(doctor.getDid() + "\t" + doctor.getDname() + "  \t" + doctor.getSpecilist() + "     \t" + doctor.getAppoint() + "    \t" + doctor.getDoc_qual() + "       \t" + doctor.getDroom());
    }
}
