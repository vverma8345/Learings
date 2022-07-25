package JavaLearnings;

import java.util.Comparator;

public class Employee {

    private String empName;
    private String empSalary;
    private String empDepartment;


    public Employee(String empName, String empSalary, String empDepartment) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;
    }

    public Employee() {

    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }



    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }


}
