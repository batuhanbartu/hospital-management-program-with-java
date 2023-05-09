package business;

import entity.Facility;
import service.FacilityService;

import java.util.Scanner;

public class FacilityImpl implements FacilityService //Sorry Facility but do not change the name
{

    @Override
    public Facility addFacility() {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        String fec_name = input.nextLine();
        return new Facility(fec_name);
    }

    @Override
    public void showFacility(Facility facility) {
        System.out.println(facility.getFec_name());
    }
}
