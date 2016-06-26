package pe.edu.utp.employeesapp.models;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class Department {
    private int no;
    private String name;

    public Department(int no, String name) {
        this.no=no;
        this.name=name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
