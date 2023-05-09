import business.*;
import dao.Dao;
import entity.*;
import service.*;

import java.util.*;
import java.util.Calendar;

public class Main {
    private static final Dao dao = new Dao(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    private static final DoctorService doctorService = new DoctorImpl();
    private static final FacilityService facilityService = new FacilityImpl();
    private static final LabService labService = new LabImpl();
    private static final PatientService patientService = new PatientImpl();
    private static final MedicalService medicalService = new MedicalImpl();
    private static final StaffService staffService = new StaffImpl();

    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + dao.months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        dao.addList();
        Scanner input = new Scanner(System.in);
        int choice, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                final var newDoctor = doctorService.newDoctor();
                                dao.doctors.add(newDoctor);
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                System.out.println("--------------------------------------------------------------------------------");
                                dao.doctors.forEach(doctorService::doctorInfo);

                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                final var newPatient = patientService.newPatient();
                                dao.patients.add(newPatient);
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");
                                dao.patients.forEach(patientService::patientInfo);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                final var newMedical = medicalService.newMedical();
                                dao.medicals.add(newMedical);
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                dao.medicals.forEach(medicalService::findMedical);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4: {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                final var newFacility = labService.newFacility();
                                dao.labs.add(newFacility);
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Fecilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                dao.labs.forEach(labService::facilityList);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5: {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                final var newFacility = facilityService.addFacility();
                                dao.facilities.add(newFacility);
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                dao.facilities.forEach(facilityService::showFacility);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
                case 6: {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                final var newStaff = staffService.newStaff();
                                dao.staffs.add(newStaff);
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                final var nurse = dao.staffs.stream().filter(staff1 -> staff1.getDesg().equals("nurse"));
                                nurse.forEach(staffService::staffInfo);
                                break;
                            }
                            case 3: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                final var nurse = dao.staffs.stream().filter(staff1 -> staff1.getDesg().equals("worker"));
                                nurse.forEach(staffService::staffInfo);
                                break;
                            }
                            case 4: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                final var nurse = dao.staffs.stream().filter(staff1 -> staff1.getDesg().equals("security"));
                                nurse.forEach(staffService::staffInfo);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}