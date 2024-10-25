package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departamentName;
    private Integer payDay;

    private Employee employee;
    private Addres addres;
    private ArrayList<Employee> employees = new ArrayList<Employee>();


    public Department() {
    }

    public Department(String departamentName, Integer payDay) {
        this.departamentName = departamentName;
        this.payDay = payDay;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double sum = 0;
        for (Employee c : employees) {
            sum += c.getSalary();
        }
        return sum;
    }

}
