package business;

import entity.Staff;
import service.StaffService;

import java.util.Scanner;

public class StaffImpl implements StaffService {

    @Override
    public Staff newStaff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        String sid = input.nextLine();
        System.out.print("name:-");
        String sname = input.nextLine();
        System.out.print("desigination:-");
        String desg = input.nextLine();
        System.out.print("sex:-");
        String sex = input.nextLine();
        System.out.print("salary:-");
        int salary = input.nextInt();
        return new Staff(sid, sname, desg, sex, salary);
    }

    @Override
    public void staffInfo(Staff staff) {
        System.out.println(staff.getSid() + "\t" + staff.getSname() + "\t" + staff.getSex() + "\t" + staff.getSalary());
    }
}
