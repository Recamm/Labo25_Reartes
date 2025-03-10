#include <iostream>
#include <vector>
using namespace std;

struct Productos{
    string nombre;
    int precio;
};

struct prodCant {
    Productos producto;
    int cantidad;
};

struct Pedido{
    int nPedido;
    string cliente;
    vector <prodCant> prod;
};

void agregarPedido(){

}

void cancelarPedido(){

}

void verPedidos(){

}

void ingresoDia(){

}

void editarEstado(){

}

int menu(){
    cout << R"(
    +--------MENU--------+
    | 1. Agregar pedido  |
    | 2. Cancelar pedido |
    | 3. Ver pedidos     |
    | 4. Ingreso del dia |
    | 5. Editar estado   |
    | 6. Salir           |
    +--------------------+
    )" << endl;
    int opcion;
    cout << "--> ";
    cin >> opcion;
    return opcion;
}

int main(){
    vector <Productos> productosListas = {
    {"Arroz", 1000}, 
    {"Fideos", 2500}, 
    {"Pollo", 7500}, 
    {"Pan", 2500}
    };

    vector <Pedido> pedidos;
    
    bool bucle = true;
    while (bucle){
        switch (menu()){
        case 1:
            agregarPedido();
            break;
        case 2:
            cancelarPedido();
            break;
        case 3:
            verPedidos();
            break;
        case 4:
            ingresoDia();
            break;
        case 5:
            editarEstado();
            break;
        case 6:
            bucle = false;
            break;
        default:
            break;
        }
    }

}
