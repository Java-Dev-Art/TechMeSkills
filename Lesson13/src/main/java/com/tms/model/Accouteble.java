package com.tms.model;

import java.util.List;

public class Accouteble implements Report {
    @Override
    public void generateReport(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.printf("Employer : %s    |%.2f\n", employee.getFullName(), employee.getSalary());
        }
    }
}
