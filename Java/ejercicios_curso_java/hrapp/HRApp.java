package ejercicios_curso_java.hrapp;

import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("INICIO");

        Employee e1 = new Employee(784, "Camilo1",99);
        Employee e2 = new Employee(785,"Camilo2",99999);

        Department dept = new Department("EjemploDEP", new ArrayList<>());
        dept.addEmp(e1);
        dept.addEmp(e2);

        System.out.println("Emp: " + e1);
        System.out.println("Emp: " + e2);
        ArrayList<Employee> emps = dept.getEmployees();

        for (Employee e:emps){
            System.out.println("Emp: " + e);
        }

        System.out.println("Total: " + dept.getTotalSalary());
        System.out.println("Promedio: " + dept.getAverageSalary());
        System.out.println("Empleado: " + dept.getEmployeeById(784));
    }
}
