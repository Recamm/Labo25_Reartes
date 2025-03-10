#include <iostream>
#include <vector>
using namespace std;

struct producto{
    string nombre;
    int codBarra;
    string marca;
    int precio;
    bool vencimiento;
};

int gondolaMayorValor(producto gondola[3][4]){
    int linea[4] = {0, 0, 0, 0};
    for (int i = 0; i < 4; i++){
        for (int ii = 0; ii < 3; ii++){
            linea[i] += gondola[ii][i].precio;
        }
    }
    int mayor = 0;
    int lineaMax;
    int count = 0;
    for(int max:linea){
        if (mayor < max){
            mayor = max;
            lineaMax = count;
            count++;
        }
    }
    return count;
}

int promedioPasillos(producto gondola[3][4]){
    int promedioPasillo = 0;
    for (int i = 0; i < 4; i++){
        for (int ii = 0; ii < 3; ii++){
            promedioPasillo += gondola[ii][i].precio;
        }
    }
    promedioPasillo /= 12;
    return promedioPasillo;
}

int vencimiento(producto gondola[3][4]){
    int count = 0;
    for (int i = 0; i < 4; i++){
        for (int ii = 0; ii < 3; ii++){
            if (gondola[ii][i].vencimiento){
                count++;
            }
            
        }
    }
    return count;
}

int main(){
    producto gondola[3][4] = {
        {
            {"Leche", 123456, "LaSerena", 1500, true},
            {"Pan", 234567, "Bimbo", 800, false},
            {"Jugo", 345678, "Tropicana", 1200, true},
            {"Arroz", 456789, "Arauco", 2200, true}
        },
        {
            {"Aceite", 567890, "Cocineros", 2500, false},
            {"Azúcar", 678901, "Teresita", 900, true},
            {"Galletas", 789012, "Dulces", 500, false},
            {"Cereal", 890123, "Kellogg's", 2500, true}
        },
        {
            {"Tomates", 901234, "Verduras Frescas", 350, true},
            {"Pollo", 102345, "Pollos del Campo", 5000, true},
            {"Carne", 213456, "Carnes del Valle", 7000, true},
            {"Pasta", 324567, "La Moderna", 1000, false}
        }
    };
    
    // for (int i = 0; i < 3; i++){
    //     for (int ii = 0; ii < 4; ii++){
    //         cout << gondola[i][ii].precio << " ";
    //     }
    //     cout << endl;
    // }
    

    cout << "Gondola con mayor valor: " << gondolaMayorValor(gondola) << endl;
    cout << "Prod fila 2, columna 3: " << gondola[2][3].nombre << endl;
    cout << "Promedio gondola: " << promedioPasillos(gondola) << endl;
    cout << "Prods con vencimiento: " << vencimiento(gondola) << endl;
}