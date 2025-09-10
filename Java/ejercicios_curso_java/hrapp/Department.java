package ejercicios_curso_java.hrapp;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> empleados = new ArrayList<>();
    private int lastIndexEmployee = -1;

    public Department(String name, ArrayList<Employee> empleados) {
        this.name = name;
        this.empleados = empleados;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public ArrayList<Employee> getEmployee() { return empleados; }

    public void setEmployee(ArrayList<Employee> empleados) { this.empleados = empleados; }

    public void addEmp(Employee empleado){
        if(lastIndexEmployee < empleados.size()){
            lastIndexEmployee++;
            empleados.add(empleado);
        }
    }

    public ArrayList<Employee> getEmployees(){
        ArrayList<Employee> actualizarempleados = new ArrayList<>();

        for (Employee e: empleados){
            actualizarempleados.add(e);
        }
        return actualizarempleados;
    }

    public int getEmployeesCount(){ return lastIndexEmployee++; }

    public Employee getEmployeeById(int empId){
        for(Employee e:empleados){

            if(empId == e.getID()){
                return e;
            }
        }
        return null;
    }

    public double getTotalSalary(){
        double totalSalario = 0.0;
        for (Employee e:empleados){
            totalSalario += e.getSalary();
        }
        return totalSalario;
    }

    public double getAverageSalary(){
        if(lastIndexEmployee > -1){
            return getTotalSalary()/empleados.size();
        }
        return 0.0;
    }

    public String toString(){ return name; }
}
