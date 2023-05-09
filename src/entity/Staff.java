package entity;

public class Staff {
    String sid;
    String sname;
    String desg;
    String sex;
    int salary;

    public Staff(String sid, String sname, String desg, String sex, int salary) {
        this.sid = sid;
        this.sname = sname;
        this.desg = desg;
        this.sex = sex;
        this.salary = salary;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
