<div align="center">
  <h1>LABORATORIO 2025</h1>
</div>

Consignas de los ejercicios
<details>
   
<summary> Repaso estructuras en C++ </summary>

1. Crear la estructura `Empleado` que tiene un nombre, apellido, fecha de nacimiento, sexo y salario.  

   Se pide la función `empleadoConMayorSueldo` que recibe por parámetro un vector con todos los empleados de la empresa y otro vector vacío donde se guardarán los empleados que tienen salario menor o igual a $400.000.  

   La función deberá recorrer todos los empleados de la empresa y retornar el de mayor sueldo. Además, a medida que va recorriendo los empleados, debe agregar al otro vector los empleados cuyo salario es menor o igual a $400.000.  

   Por lo tanto, luego de llamar a la función, se quiere mostrar en el `main` el empleado con mayor sueldo y mostrar el nombre y apellido de todos los empleados con salario menor o igual a $400.000.  

2. Se quieren almacenar los productos de un supermercado. De estos interesa conocer el nombre, código de barra, marca, precio y si tiene fecha de vencimiento o no.  

   Los pasillos del supermercado están compuestos por góndolas de 3 filas y 4 columnas. Ingresar tantos productos como sea necesario para llenar un pasillo y determinar:  

   - Columna de la góndola que tiene el precio de mayor valor.  

   - Nombre del producto de la fila 2, columna 3.  

   - Promedio de precios de todo ese pasillo.  

   - Cantidad de productos con fecha de vencimiento.

3. Se quiere hacer un sistema de gestión de pedidos de un Restaurante. Cada pedido tiene un número de pedido, el nombre del cliente, una lista de productos, cantidades y precios. El sistema debe permitir:
   - Agregar un nuevo pedido con sus productos.
     
   - Cancelar un pedido buscando por el número de pedido.
     
   - Mostrar todos los pedidos en curso con el total de cada uno.
     
   - Calcular el ingreso total del día sumando los totales de todos los
pedidos completados.

4. Se quiere hacer un sistema de gestión de pacientes en una clínica. Cada paciente tiene los siguientes datos: nombre, edad, número de historia clínica, y fecha de próxima cita (día, mes y año como una estructura de tipo Fecha). El sistema debe permitir:
   - Registrar nuevos pacientes y asignarles una fecha de cita.
     
   - Cancelar una cita buscando al paciente por número de historia clínica.
     
   - Mostrar todas las citas programadas para un día específico.
     
   - Buscar y mostrar información de un paciente usando su número
de historia clínica.
   
5. Realizar un sistema para la gestión de un McDonald’s. El sistema cuenta con un menú de 20 productos diferentes, cada uno esta conformado por: Un nombre, si tiene promoción o no, cantidad de ventas, el precio y la categoría a la que pertenece (Hamburguesa, Bebida, Postre, etc.). Ademas, cada pedido realizado debe registrar los siguientes datos: El nombre del cliente, productos pedidos, cantidad de cada producto, la fecha que se pidió y el precio total.
   
   #### Requerimientos:
   - Se deberá implementar al menos 2 estructuras y 4 funciones.
     
   #### Funcionalidades:
   - El usuario, antes de poder realizar cualquier acción en el sistema, deberá ingresar todos los productos al mismo.
     
   - Luego de cargar los productos al sistema, el usuario deberá poder registrar un pedido, calculando automáticamente el precio total, considerando las promociones activas (Para los productos que tienen promociones activas, se les aplicará un descuento del 20% al precio del producto).
     
   - El usuario deberá poder consultar un pedido específico por el nombre del cliente. Mostrando por pantalla la información del pedido.
     
   - El sistema deberá mostrar por pantalla los productos ordenados por ventas de mayor a menor.

6. Realizar un sistema para la organización de un torneo de futbol. El torneo está compuesto por 24 equipos, cada uno está conformado por: un nombre, 11 jugadores (1 jugador es el arquero), la cantidad de goles a favor y en contra, la posición en el torneo (Determinada por los resultados de los partidos: Las Victorias suman : +3, los Empates suman: +1 y las Derrotas suman: +0) y el historial de partidos (Se guardará en formato: V, E, D).

   Ademas, cada partido debe registrar los siguientes datos: El nombre de los equipos (Local y Visitante), cantidad de goles anotados por cada equipo, la fecha y el estadio donde se disputó.

   #### Requerimientos:
   - Se deberá implementar al menos 3 estructuras y 4 funciones.

   #### Funcionalidades:
   - El usuario deberá poder ingresar todos los equipos al sistema.
     
   - El usuario deberá poder registrar todos los datos de cada partido, actualizando la información de los equipos que jugaron.
     
   - El usuario deberá poder mostrar por pantalla, la información de un partido especifico, seleccionando los nombres de los equipos que se enfrentaron.
     
   - El usuario deberá poder mostrar la tabla de posiciones del torneo, ordenada de mayor a menor según la puntuación. En caso de empate en la puntuación, el desempate se realizara en base a la Cantidad de goles a favor (De mayor a menor). La tabla debe mortrar: Posición - Nombre del equipo - Cantidad de goles a favor - Cantidad de goles en contra - Historial de partidos.

7. Realizar un sistema para la organización de carreras de Formula 1. En total se corren 24 carreras por año y están compuestas por 10 equipos, cada uno esta conformado por 2 pilotos (Por lo que serán 20 pilotos en total), se deberá hacer un sistema para determinar el equipo ganador anual de Formula 1.
   
      #### Estructuras:
      - Cada piloto está conformado por: un nombre, el numero del auto, el nombre del equipo que participan, la posición que arrancan la carrera, la posición en la que la finalizan, la cantidad de puntos que obtuvieron por carrera (Los primeros 10 puestos suman puntaje) y si obtuvo la vuelta rápida o no.
      - 
      ~~~
         struct Vuelta_rapida {
           int numero_vuelta;
           int tiempo;
           string nombre_piloto;
         }
      
         struct Equipo {
            string nombre;
            int puntos;
         }
      ~~~
        
      #### Funcionalidades:
      Utilizando el siguiente main (Pueden agregar más variables y funciones, elegir el tipo de dato de las funciones, como devuelven su info. y los parámetros de las mismas), deberán hacer todo lo que se pide en cada punto, tengan en cuenta que los equipos ya tienen su nombre y se encuentran con 0 puntos.
   
      ~~~
      int main(){
         vector<Equipo> equipos;
         vector<Piloto> pilotos;
         for (int i = 0; i < 24; i++){
            // 1
            cargar_datos_carrera();
            // 2
            calcular_puntaje_piloto_equipo();
         }
         // 3
         ordenar_tabla_equipos();
         mostrar_tabla_equipos();
      }
      ~~~
      
      1- Cargar los pilotos por posición de llegada en la carrera y quien hizo la vuelta rápida.
         
      2- Calcular en base a la posición de llegada, los puntos que suman los pilotos a su equipo (Los
      puntos van del primer al décimo puesto: 25, 18, 15, 12, 10, 8, 6, 4, 2 y 1 puntos). Tener en
      cuenta la vuelta rápida (La vuelta rápida suma 1 punto adicional, si el piloto se encuentra en
      los primeros 10 puestos).
      
      3- Ordenar y mostrar por pantalla, la tabla de mayor a menor puntaje para saber el equipo
      ganador anual de Formula 1.
</details>

<details>
   
<summary> JAVA (Unidad 0) </summary>

#### 1. IngresoDatos

Escribe un programa en Java que realice lo siguiente:

- Declarar una variable N de tipo `int`
- Una variable A de tipo `double`
- Una variable C de tipo `char`

Luego de asignar a cada una un valor, mostrar por pantalla:

- El valor de cada variable.
- La suma de `N + A`.
- La diferencia de `A – N`.
- El valor numérico correspondiente al carácter que contiene la variable C.

  ~~~
   Variable N = 5 
   Variable A = 4.56 
   Variable C = a                       
   5 + 4.56 = 9.559999999999999 
   4.56 - 5 = -0.4400000000000004 
   Valor numérico del carácter a = 97
  ~~~    

 
#### 2. NumeroMayor

Declarar 2 variables numéricas e indicar cuál es mayor de los dos. En caso de que sean iguales, indicarlo también.

#### 3. DivisibleFor/DivisibleWhile

Mostrar los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.

#### 4. DiaLaboral

Crear un programa que nos pida un día de la semana y nos diga si es un día laboral o no. Los días laborales se consideran de lunes a viernes.

#### 5. Vocales

Del siguiente String: `“Ayer me compré muñecos de la marca ‘ToyCo’ por internet.”` contar cuántas vocales hay en total y mostrarlo por pantalla.

#### 6. ReemplazoLetra

Reemplazar todas las ‘e’ del ejercicio anterior por la letra que ingrese el usuario.

#### 7. IntroducirNumeros

Crear una aplicación que nos permita insertar números hasta que insertemos un `-1`. Luego, mostrar la cantidad de números introducidos.

#### 8. IntroducirNumeros (Ampliado)

Además de la cantidad de números introducidos, se debe mostrar:

- Mayor número introducido.
- Menor número introducido.
- Suma de todos los números.
- Suma de los números positivos.
- Suma de los números negativos.

#### 9. PalabrasIguales

Pedir dos palabras al usuario e indicar si son iguales o no.
</details>
<details>
<summary>Unidad 1 - Clases y objetos</summary>

### 1. Clase `Círculo`
Crear una clase llamada `Círculo` con los siguientes atributos y métodos:
- Atributo: `radio`
- Constructor por defecto (`radio=2`)
- Constructor parametrizado
- Getter y setter
- Método para calcular el área (`π * r^2`)
- Método para calcular el perímetro (`2 * π * r`)

### 2. Clase `Rectángulo`
Crear una clase llamada `Rectángulo` con los siguientes atributos y métodos:
- Atributos: `base`, `altura`
- Constructor parametrizado
- Getters y setters
- Método para calcular el área
- Método para calcular el perímetro

### 3. Clase `Coche`
Crear una clase llamada `Coche` con los siguientes atributos y métodos:
- Atributos: `marca`, `modelo`, `color`
- Constructor parametrizado
- Getters y setters
- Métodos: `acelerar`, `frenar`, `mostrarVelocidadActual`

### 4. Clase `Persona`
Crear una clase llamada `Persona` con los siguientes atributos y métodos:
- Atributos: `nombre`, `edad`, `dirección`
- Método para imprimir los datos de la persona en pantalla

### 5. Clase `Fecha`
Crear una clase `Fecha` con los siguientes atributos y métodos:
- Atributos: `día`, `mes`, `año`
- Métodos:
  - `valida()`: Verifica si la fecha es correcta y ajusta valores inválidos.
  - `diasMes(int mes)`: Devuelve el número de días del mes indicado.
  - `corta()`: Muestra la fecha en formato corto (`dd-mm-yyyy`).
  - `larga()`: Muestra la fecha en formato largo (`día de la semana dd de mes de yyyy`).
  - `siguiente()`: Avanza un día.
  - `anterior()`: Retrocede un día.
  - `igualQue(Fecha fecha)`: Indica si la fecha es igual a otra.
  - `menorQue(Fecha fecha)`: Indica si la fecha es anterior a otra.
  - `mayorQue(Fecha fecha)`: Indica si la fecha es posterior a otra.

### 6. Clase `Libro`
Crear una clase llamada `Libro` con los siguientes atributos y métodos:
- Atributos: `título`, `autor` (usar la clase `Persona`), `ISBN`, `páginas`, `editorial`, `fechaPublicacion` (usar la clase `Fecha`)
- Métodos:
  - Mostrar la información del libro
  - Comparar si la fecha de publicación es anterior a otro libro dado
  - 3 constructores distintos a elección
  - Getters y setters

### 7. Clase `Cafetera`
Modelar una `Cafetera` con los siguientes atributos y métodos:
- Atributos: `cantidadMaxima`, `cantidadActual`
- Métodos:
  - `Constructor por defecto`: Cantidad máxima = 1000cc, cantidad actual = 0cc.
  - `Constructor con cantidad máxima`: Inicializa cantidad actual a la capacidad máxima.
  - `Constructor con cantidad máxima y actual`: Ajusta la cantidad actual si es mayor que la capacidad.
  - `llenarCafetera()`: Llena la cafetera al máximo.
  - `servirTaza(int capacidad)`: Sirve café en una taza hasta la capacidad indicada.
  - `vaciarCafetera()`: Vacía la cafetera.
  - `agregarCafe(int cantidad)`: Añade café a la cafetera.

### 8. Clase `Cancion`
Crear una clase llamada `Cancion` con los siguientes atributos y métodos:
- Atributos: `título`, `autor`
- Métodos:
  - Constructor por defecto (inicializa atributos con cadenas vacías)
  - Constructor parametrizado
  - Getters y setters

</details>
