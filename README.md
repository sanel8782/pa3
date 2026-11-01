# PA3 - Sistema de Gestión de Productos

**Curso:** Programación Orientada a Objetos  
**Trabajo:** Proceso de Aprendizaje 3  
**Lenguaje de programación:** Java


## 1. Descripción del proyecto

Este proyecto consiste en desarrollar un sistema básico de gestión de productos utilizando Java.
El programa permite registrar, buscar, eliminar, listar y ordenar productos mediante el uso de `ArrayList`, que forma parte de Java Collections Framework.
Para su desarrollo utilizamos clases, objetos, métodos y colecciones, para de organizar el código y sea eficaz.
El sistema funciona por consola y cuenta con un menú que permite al usuario seleccionar las diferentes operaciones disponibles.

## 2. Integrantes del equipo

| N.º | Apellidos y nombres |
|---|---|
| 1 | [Nombre del integrante 1] |
| 2 | [Nombre del integrante 2] |
| 3 | [Nombre del integrante 3] |
| 4 | [Nombre del integrante 4] |
| 5 | [Nombre del integrante 5] |

## 3. Tecnologías utilizadas

Para desarrollar el proyecto utilizamos las siguientes herramientas y conceptos:

- **Java:** lenguaje de programación utilizado para desarrollar el sistema.
- **Programación Orientada a Objetos:** para organizar el programa mediante clases, atributos y métodos.
- **ArrayList:** para almacenar los productos registrados.
- **Collections:** para trabajar con el ordenamiento de los productos.
- **IntelliJ IDEA:** entorno de desarrollo utilizado para trabajar con el código Java.

## 4. Estructura del proyecto

El proyecto está organizado en diferentes clases para separar las funciones del sistema y facilitar su comprensión.

```text
src/
└── pa3/
    ├── Producto.java
    ├── Inventario.java
    ├── GestorColecciones.java
    ├── Menu.java
    └── Main.java
```

**Descripción de las clases:**

| Clase | Descripción |
|---|---|
| `Producto.java` | Contiene los atributos y métodos relacionados con los productos. |
| `Inventario.java` | Se encarga de gestionar los productos registrados. |
| `GestorColecciones.java` | Permite trabajar con las operaciones de las colecciones. |
| `Menu.java` | Muestra las opciones disponibles para el usuario. |
| `Main.java` | Es la clase principal desde donde se ejecuta el programa. |

## 5. Funcionalidades del sistema

El sistema cuenta con las siguientes opciones:

1. **Listar productos:** muestra los productos que se encuentran registrados.
2. **Agregar productos:** permite ingresar nuevos productos al inventario.
3. **Buscar productos:** permite encontrar un producto mediante su código.
4. **Eliminar productos:** permite retirar un producto de la lista.
5. **Ordenar productos por precio:** organiza los productos según su precio.
6. **Recuperar productos por posición:** permite consultar un producto según su ubicación en el `ArrayList`.

Estas funcionalidades se realizan mediante un menú en consola, donde el usuario selecciona la opción que desea ejecutar.

## 6. Almacenamiento de los productos

Para almacenar los productos utilizamos una colección de tipo `ArrayList<Producto>`.

Esta colección nos permite agregar, consultar y eliminar productos sin tener que definir una cantidad fija de elementos.

Los datos se mantienen en memoria mientras el programa está funcionando. Por este motivo, cuando se cierra el programa, los productos registrados no se guardan de forma permanente.

## 7. Métodos utilizados

Durante el desarrollo del proyecto trabajamos con los siguientes métodos de Java Collections Framework:

| Método | Descripción |
|---|---|
| `add()` | Permite agregar un producto a la lista. |
| `get()` | Permite obtener un producto según su posición. |
| `remove()` | Permite eliminar un producto. |
| `size()` | Permite conocer la cantidad de productos registrados. |
| `Collections.sort()` | Permite ordenar los productos por precio utilizando un criterio de comparación. |

Estos métodos nos ayudaron a realizar las operaciones principales del sistema y a practicar el uso de colecciones en Java.

## 8. Instrucciones para ejecutar el proyecto

Para ejecutar el programa, se deben seguir estos pasos:

1. Tener instalado Java JDK en la computadora.
2. Abrir IntelliJ IDEA.
3. Abrir la carpeta del proyecto.
4. Ubicar el paquete `pa3` dentro de `src`.
5. Buscar y abrir la clase `Main.java`.
6. Ejecutar el programa desde la clase `Main`.
7. Utilizar el menú de consola para probar las funcionalidades.

El programa mostrará las opciones disponibles y permitirá realizar las operaciones con los productos.

## 9. Video de exposición

Como parte de la presentación del PA3, se realizará un video donde explicaremos el funcionamiento del sistema, las clases utilizadas y las operaciones desarrolladas por el equipo.

**Enlace del video:** [Agregar enlace de YouTube]

## 10. Registro de cambios en GitHub

Para guardar y subir los cambios realizados al repositorio, utilizamos los siguientes comandos:

```bash
git add src/pa3/Main.java README.md
git commit -m "Integrar sistema y documentar proyecto"
git push
```

El primer comando agrega los archivos indicados, el segundo registra los cambios mediante un commit y el tercero los envía al repositorio remoto.

---

**Programación Orientada a Objetos - PA3**

Proyecto académico desarrollado en Java para aplicar el uso de clases, objetos y colecciones mediante un sistema básico de gestión de productos.
Archivo: README.md


## 3. Tecnologias utilizadas

- Java
- ArrayList
- Collections

## 4. Estructura del proyecto

src/
  pa3/
    Producto.java
    Inventario.java
    GestorColecciones.java
    Menu.java
    Main.java

## 5. Funcionalidades

1. Listar productos registrados.
2. Agregar nuevos productos.
3. Buscar productos por codigo.
4. Eliminar productos.
5. Ordenar productos por precio.
6. Recuperar productos por posicion.

## 6. Almacenamiento de datos

Los productos se almacenan en una coleccion
ArrayList<Producto>.

Esta coleccion permite agregar, recuperar y eliminar
elementos durante la ejecucion del programa.

Los datos se mantienen en memoria y no se almacenan
permanentemente al cerrar el programa.

## 7. Operaciones utilizadas

- add(): agrega productos.
- get(): recupera productos por posicion.
- remove(): elimina productos.
- size(): consulta la cantidad de elementos.
- Collections.sort(): ordena los productos por precio.

## 8. Ejecucion

Abrir el proyecto desde un IDE compatible con Java.

Ejecutar la clase Main.java.

## 9. Video de exposicion

[Agregar enlace de YouTube]

Commit:
git add src/pa3/Main.java README.md
git commit -m "Integrar sistema y documentar proyecto"
git push
