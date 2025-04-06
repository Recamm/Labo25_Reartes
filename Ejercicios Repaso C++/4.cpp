#include <iostream>
#include <vector>

using namespace std;

struct Fecha {
    int dia, mes, anio;
};

struct Paciente {
    string nombre;
    int edad;
    int nroHistoriaClinica;
    Fecha proximaCita;
    bool cita = true;
};

void clean(){
    for (int i = 0; i < 50; i++){
        cout << endl;
    }
}

void menu(){
    cout << R"(
    +------- MENU -------+
    | 1. Nuevo paciente  |
    | 2. Ver pacientes   |
    | 3. Cancelar cita   |
    | 4. Mostrar citas   |
    | 5. Info Paciente   |
    | 6. Salir           |
    +--------------------+
    )" << endl;
}

void nuevoPaciente(vector <Paciente> &pacientes){
    clean();
    
    Paciente pacienteClinica;

    string nombre;
    cout << "Nombre paciente -->";
    cin >> nombre;

    
    int edad = 0;
    while (edad < 1){
        cout << "Edad paciente -->";
        cin >> edad;
    }

    pacienteClinica.nombre = nombre;
    pacienteClinica.edad = edad;
    pacienteClinica.nroHistoriaClinica = pacientes.size();
    pacienteClinica.proximaCita.dia = rand() % 31;
    pacienteClinica.proximaCita.mes = rand() % 13;
    pacienteClinica.proximaCita.anio = 2025;

    pacientes.push_back(pacienteClinica);

    cout << endl;
    cout << "Paciente creado con exito!" << endl;

    string a;
    cout << "Presione una tecla para continuar --> ";
    cin >> a;
    clean();
}

void verPacientes(vector <Paciente> pacientes){
    clean();
    for (Paciente p:pacientes){
        cout << "----------------------------------" << endl;
        cout << "Nro Historia Clinica: " << p.nroHistoriaClinica << endl;
        cout << "Paciente: " << p.nombre << endl;
        cout << "Edad: " << p.edad << endl;
        if (p.cita){
            cout << "Proxima cita: " << p.proximaCita.dia << "/" << p.proximaCita.mes << "/" << p.proximaCita.anio << endl;
        } else {
            cout << "No hay proxima cita" << endl;
        };
        
        cout << "----------------------------------" << endl;
    }

    string a;
    cout << "Presione una tecla para continuar --> ";
    cin >> a;
    clean();
}

void cancelarCita(vector <Paciente> &pacientes){
    clean();

    int cita = -1;
    while (cita < 0 or cita > pacientes.size() - 1){
        cout << "Numero de paciente --> ";
        cin >> cita;
    }
    
    if (pacientes[cita].cita){
        pacientes[cita].cita = false;
        cout << "Cita cancelada con exito!" << endl;
    } else {
        cout << "No hay cita para cancelar" << endl;
    }
    
    string a;
    cout << endl;
    cout << "Presione una tecla para continuar --> ";
    cin >> a;
    clean();
}

void mostrarCitas(vector <Paciente> pacientes){
    int anioActual = 2025, dia = -1, mes = -1, anio= -1;
    int meses[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // imaginamos que no hay anio bisiesto
    while (anio < anioActual){
        cout << "Anio --> ";
        cin >> anio;
    }
    while (mes < 1 or mes > 12){
        cout << "Mes --> ";
        cin >> mes;
    }
    while (dia < 1 or dia > meses[mes - 1]){
        cout << "Dia --> ";
        cin >> dia;
    }

    vector <Paciente> pacientesCita;
    for(Paciente p:pacientes){
        if (p.cita){
            if (p.proximaCita.dia == dia and p.proximaCita.mes == mes and p.proximaCita.anio == anio){
                pacientesCita.push_back(p);
            }
        }
    }

    if (pacientesCita.size() > 0){
        cout << "Hay " << pacientesCita.size() << "pacientes con cita el " << dia << "/" << mes << "/" << anio << endl;
        cout << "----------------------------------" << endl;
        for (Paciente p:pacientesCita){
            cout << "Nro Historia Clinica: " << p.nroHistoriaClinica << endl;
            cout << "Paciente: " << p.nombre << endl;
            cout << "Edad: " << p.edad << endl;
            cout << "----------------------------------" << endl;
        }
    } else {
        cout << "No hay pacientes con cita el " << dia << "/" << mes << "/" << anio << endl;
    }
    
    string a;
    cout << endl;
    cout << "Presione una tecla para continuar --> ";
    cin >> a;
    clean();
}

void verPaciente(vector <Paciente> pacientes) {
    int pacienteId = -1;
    while (pacienteId < 0 or pacienteId > pacientes.size() - 1){
        cout << "Numero de paciente --> ";
        cin >> pacienteId;
    }
    for(Paciente p:pacientes){
        if (p.nroHistoriaClinica == pacienteId){
            cout << "----------------------------------" << endl;
            cout << "Nro Historia Clinica: " << p.nroHistoriaClinica << endl;
            cout << "Paciente: " << p.nombre << endl;
            cout << "Edad: " << p.edad << endl;
            if (p.cita){
                cout << "Proxima cita: " << p.proximaCita.dia << "/" << p.proximaCita.mes << "/" << p.proximaCita.anio << endl;
            } else {
                cout << "No hay proxima cita" << endl;
            };
            cout << "----------------------------------" << endl;
        }
    }
    string a;
    cout << endl;
    cout << "Presione una tecla para continuar --> ";
    cin >> a;
    clean();
    
}

int main() {
    vector <Paciente> pacientes;

    bool bucle = true;
    while (bucle){
        clean();
        int opcion = 0;
        while (opcion < 1 or opcion > 6){
            menu();
            cout << "-->";
            cin >> opcion;
        }
        switch (opcion){
        case 1:
            nuevoPaciente(pacientes);
            break;
        case 2:
            verPacientes(pacientes);
            break;
        case 3:
            cancelarCita(pacientes);
            break;
        case 4:
            mostrarCitas(pacientes);
            break;
        case 5:
            verPaciente(pacientes);
            break;
        case 6:
            bucle = false;
            break; 
        break;
        default:
            break;
        }
    }
    
}
