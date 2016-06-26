package pe.edu.utp.employeesapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class EmployeesEntity  extends BaseEntity{

        private static String DEFAULT_QUERY = "SELECT * FROM employees";

        public List<Employee> findAll() {
            String query = DEFAULT_QUERY;
            try {
                ResultSet rs = getConnection().createStatement()
                        .executeQuery(query);
                if(rs == null) {
                    return null;
                }
                List<Employee> employees = new ArrayList<>();
                while(rs.next()) {
                    Employee employee = new Employee(
                            rs.getInt("emp_no"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getDate("birth_date"),
                            rs.getDate("hire_date")
                    );
                    employees.add(employee);
                }
                return employees;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }



}
