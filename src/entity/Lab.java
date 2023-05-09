package entity;

public class Lab {
    String facility;
    int labCost;

    public Lab(String facility, int labCost) {
        this.facility = facility;
        this.labCost = labCost;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getLabCost() {
        return labCost;
    }

    public void setLabCost(int labCost) {
        this.labCost = labCost;
    }
}
