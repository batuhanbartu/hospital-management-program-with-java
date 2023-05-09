package business;

import entity.Lab;
import service.LabService;

import java.util.Scanner;

public class LabImpl implements LabService {

    @Override
    public Lab newFacility() {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:-");
        String facility = input.nextLine();
        System.out.print("cost:-");
        int labCost = input.nextInt();
        return new Lab(facility, labCost);
    }

    @Override
    public void facilityList(Lab lab) {
        System.out.println(lab.getFacility() + "\t\t" + lab.getLabCost());
    }
}
