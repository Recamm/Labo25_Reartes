#include <iostream>
#include <vector>
using namespace std;

struct Empleado
{
    string nombre;
    string apellido;
    int nacimiento[3];
    string sexo;
    int salario;
};

Empleado empleadoConMayorSueldo (vector <Empleado> empleados, vector <Empleado> &sueldoBajo){
    Empleado empleadoComparacion;
    Empleado topEmpleado;
    empleadoComparacion = empleados[0];
    for(Empleado empl:empleados){
        if (empl.salario <= 400000){
            sueldoBajo.push_back(empl);
        }
        if (empl.salario > empleadoComparacion.salario){
            topEmpleado = empl;
        }
        empleadoComparacion = empl;
    }
    return topEmpleado;
}

int main(){
    vector <Empleado> empleados = {
        {"Juan", "Pérez", {10, 5, 1985}, "Masculino", 300000},
        {"María", "Gómez", {3, 8, 1990}, "Femenino", 32000},
        {"Carlos", "Ramírez", {15, 11, 1982}, "Masculino", 428000},
        {"Ana", "Sánchez", {27, 2, 1995}, "Femenino", 105000},
        {"Luis", "Martínez", {5, 6, 1988}, "Masculino", 333000},
        {"Carmen", "Díaz", {17, 4, 1993}, "Femenino", 315000},
        {"Pedro", "Fernández", {1, 12, 1978}, "Masculino", 629000},
        {"Lucía", "González", {22, 7, 1992}, "Femenino", 834000},
        {"José", "Hernández", {14, 9, 1980}, "Masculino", 330000},
        {"Elena", "Jiménez", {11, 10, 1986}, "Femenino", 132500}
    };
    vector <Empleado> sueldoBajo;
    Empleado mejorEmpleado = empleadoConMayorSueldo(empleados, sueldoBajo);
    
    int count = 0;
    for(Empleado ej:sueldoBajo){
        cout << "Nro " << count << endl;
        cout << "Nombre: " << ej.nombre << endl;
        cout << "Apellido: " << ej.apellido << endl;
        cout << "--------------------" << endl;
        count++;
    }
    cout << "Mejor empleado: " << mejorEmpleado.nombre << " " << mejorEmpleado.apellido << endl;
}
