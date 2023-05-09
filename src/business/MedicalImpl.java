package business;

import entity.Medical;
import service.MedicalService;

import java.util.Scanner;

public class MedicalImpl implements MedicalService {

    @Override
    public Medical newMedical() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        String med_name = input.nextLine();
        System.out.print("comp:-");
        String med_comp = input.nextLine();
        System.out.print("exp_date:-");
        String exp_date = input.nextLine();
        System.out.print("cost:-");
        int med_cost = input.nextInt();
        System.out.print("no of unit:-");
        int count = input.nextInt();
        return new Medical(med_name, med_comp, exp_date, med_cost, count);
    }

    @Override
    public void findMedical(Medical medical) {
        System.out.println(medical.getMed_name() + "  \t" + medical.getMed_comp() + "    \t" + medical.getMed_comp() + "     \t" + medical.getMed_cost());
    }
}
