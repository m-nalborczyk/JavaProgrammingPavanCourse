package day8;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.employeeId = 32236754;
        employee1.employeeName = "John Doe";
        employee1.employeeSalary = 3050;
        employee1.job = "technician";
        employee1.display();

        Employee employee2 = new Employee();
        employee2.employeeId = 234567774;
        employee2.employeeName = "Franz Grass";
        employee2.employeeSalary = 7500;
        employee2.job = "office manager";
        employee2.display();

    }
}
