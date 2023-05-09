package entity;

public class Doctor {
    public String did;
    public String dname;
    public String specilist;
    public String appoint;
    public String doc_qual;
    public int droom;

    public Doctor(String did, String dname, String specilist, String appoint, String doc_qual, int droom) {
        this.did = did;
        this.dname = dname;
        this.specilist = specilist;
        this.appoint = appoint;
        this.doc_qual = doc_qual;
        this.droom = droom;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSpecilist() {
        return specilist;
    }

    public void setSpecilist(String specilist) {
        this.specilist = specilist;
    }

    public String getAppoint() {
        return appoint;
    }

    public void setAppoint(String appoint) {
        this.appoint = appoint;
    }

    public String getDoc_qual() {
        return doc_qual;
    }

    public void setDoc_qual(String doc_qual) {
        this.doc_qual = doc_qual;
    }

    public int getDroom() {
        return droom;
    }

    public void setDroom(int droom) {
        this.droom = droom;
    }
}
