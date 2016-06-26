package pe.edu.utp.employeesapp.models;


import java.util.Date;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class Employee {
    private int no;
    private String nameFirst;
    private String nameLast;
    private Date dateBirth;
    private Date dateHire;

    public Employee(int no,String nameFirst,String nameLast,Date dateBirth,Date dateHire) {
        this.no=no;
        this.nameFirst=nameFirst;
        this.nameLast=nameLast;
        this.dateBirth=dateBirth;
        this.dateHire=dateHire;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateHire() {
        return dateHire;
    }

    public void setDateHire(Date dateHire) {
        this.dateHire = dateHire;
    }
}
