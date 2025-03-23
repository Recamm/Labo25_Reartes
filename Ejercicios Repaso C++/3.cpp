#include <iostream>
#include <vector>
using namespace std;
 
struct Producto{
    int idProd;
    string nombre;
    int precio;
};
 
struct prodCant {
    int productoId;
    int cantidad;
};
 
struct Pedido{
    int nroPedido;
    string cliente;
    vector <prodCant> prod;
    int estado; // 0: Entregado, 1: En proceso, 2: Cancelado
    int total;
};
 
void clean(){
    for (int i = 0; i < 10; i++){
        cout << endl;
    }  
}
 
void agregarPedido(vector <Pedido> &pedidos, vector <Producto> productosListas){
    string nombreCliente;
    vector <prodCant> pedidoProductos;
 
    cout << "Nombre cliente --> ";
    cin >> nombreCliente;
    
    bool bucle = true;
    while (bucle){
        clean();
        int opcion = -1, cant = 0, count = 0;
        cout << "Productos: " << endl;
        for (Producto i:productosListas){
            cout << count << ". " << i.nombre << endl;
            count++;
        }
        while (opcion < 0 or opcion > productosListas.size()){
            cout << endl;
            cout << "Escribi " << productosListas.size() << " para salir!" << endl;;
            cout << "Producto (numero) -->";
            cin >> opcion;
        }
        if (opcion == productosListas.size()){
            bucle = false;
            Pedido pedidoActual;
            pedidoActual.nroPedido = pedidos.size();
            pedidoActual.cliente = nombreCliente;
            pedidoActual.prod = pedidoProductos;
            pedidoActual.estado = 1;
            int t = 0;
            for (prodCant p:pedidoProductos){
                t += p.cantidad * productosListas[p.productoId].precio;
            }
            pedidoActual.total = t;
            pedidos.push_back(pedidoActual);
        } else {
            while (cant < 1){
                cout << "Cantidad de " << productosListas[opcion].nombre << " -->";
                cin >> cant;
                prodCant productoActual;
                productoActual.productoId = productosListas[opcion].idProd;
                productoActual.cantidad = cant;
                pedidoProductos.push_back(productoActual);
            }
        }
    }
 
    return;
}

void verPedidos(vector <Pedido> pedidos, vector <Producto> productosListas, bool tf){
    for(Pedido p:pedidos){
        if (true){
            cout << "---------------------" << endl;
            cout << "Nro Pedido --> " << p.nroPedido << endl;
            cout << "Cliente --> " << p.cliente << endl;
            string est;
            switch (p.estado){
            case 0:
                est = "Entregado";
                break;
            case 1:
                est = "En proceso";
                break;
            case 2:
                est = "Cancelado";
                break;
        
            default:
                break;
            }
            cout << "Estado --> " << est << endl;
            cout << "Productos:" << endl;
            int count = 0;
            for(prodCant infoProducto:p.prod){
                cout << count << ". " << productosListas[infoProducto.productoId].nombre << " x" << infoProducto.cantidad << endl;
            }
            cout << "Total: $" << p.total << endl;
        }
    }
    if (tf){        
        string a;
        cin >> a;
    }
    return;
}

void cancelarPedido(vector <Pedido> &pedidos, vector <Producto> productosListas){
    verPedidos(pedidos, productosListas, false);
    int idDel = -1;
    while (idDel < 0 or idDel > productosListas.size() - 1){
        cout << "Nro pedido a eliminar --> ";
        cin >> idDel;
    }
    for (int i = 0; i < pedidos.size(); i++){
        if (pedidos[i].nroPedido == idDel){
            pedidos[i].estado = 2;
        }
    }
}
 
void ingresoDia(vector <Pedido> pedidos){
    int ingreso = 0;
    for (Pedido p:pedidos){
        ingreso += p.total;
    }
    
    cout << "Ingresos del dia --> $" << ingreso << endl;
    string a;
    cin >> a;
}
 
int menu(){
    cout << R"(
    +--------MENU--------+
    | 1. Agregar pedido  |
    | 2. Cancelar pedido |
    | 3. Ver pedidos     |
    | 4. Ingreso del dia |
    | 5. Salir           |
    +--------------------+
    )" << endl;
    int opcion;
    cout << "--> ";
    cin >> opcion;
    return opcion;
}
 
int main(){
    vector <Producto> productosListas = {
    {0, "Arroz", 1000},
    {1, "Fideos", 2500},
    {2, "Pollo", 7500},
    {3, "Pan", 2500}
    };
 
    vector <Pedido> pedidos;
    
    bool bucle = true;
    while (bucle){
        switch (menu()){
        case 1:
            agregarPedido(pedidos, productosListas);
            break;
        case 2:
            cancelarPedido(pedidos, productosListas);
            break;
        case 3:
            verPedidos(pedidos, productosListas, true);
            break;
        case 4:
            ingresoDia(pedidos);
            break;
        case 5:
            bucle = false;
            break;
        default:
            break;
        }
        clean();
    }
 
}
