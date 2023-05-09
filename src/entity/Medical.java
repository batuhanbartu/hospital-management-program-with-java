package entity;

public class Medical {
    String med_name;
    String med_comp;
    String exp_date;
    int med_cost;
    int count;

    public Medical(String med_name, String med_comp, String exp_date, int med_cost, int count) {
        this.med_name = med_name;
        this.med_comp = med_comp;
        this.exp_date = exp_date;
        this.med_cost = med_cost;
        this.count = count;
    }

    public String getMed_name() {
        return med_name;
    }

    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }

    public String getMed_comp() {
        return med_comp;
    }

    public void setMed_comp(String med_comp) {
        this.med_comp = med_comp;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public int getMed_cost() {
        return med_cost;
    }

    public void setMed_cost(int med_cost) {
        this.med_cost = med_cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
