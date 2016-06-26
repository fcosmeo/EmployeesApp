    package pe.edu.utp.employeesapp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;
import java.util.List;

public class ServiceBean implements Serializable {
    HRService service;
    InitialContext context = null;
    String textCriteria = "";
    public ServiceBean() {
        try {
            context = new InitialContext();
            service = new HRService(context);
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> getAllEmployees() { return service.findAllEmployees(); }

}
