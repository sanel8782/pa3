package pe.edu.isil;

import java.util.Scanner;

public class Menu {

    private Inventario inventario;
    private GestorColecciones gestor;
    private Scanner scanner;

    public Menu(Inventario inventario) {
        this.inventario = inventario;
        this.gestor = new GestorColecciones(inventario);
        this.scanner = new Scanner(System.in);
    }

    public void ejecutar() {

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE GESTION DE PRODUCTOS =====");
            System.out.println("1. Listar productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Ordenar productos por precio");
            System.out.println("6. Recuperar producto por posicion");
            System.out.println("7. Salir");

            opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {

                case 1:
                    inventario.listarProductos();
                    break;

                case 2:
                    agregarProducto();
                    break;

                case 3:
                    buscarProducto();
                    break;

                case 4:
                    eliminarProducto();
                    break;

                case 5:
                    gestor.ordenarPorPrecio();
                    break;

                case 6:
                    recuperarProducto();
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 7);
    }

    private void agregarProducto() {

        System.out.println("\n===== AGREGAR PRODUCTO =====");

        System.out.print("Codigo: ");
        String codigo = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        double precio = leerDouble("Precio: ");
        int stock = leerEntero("Stock: ");

        if (codigo.trim().isEmpty() || nombre.trim().isEmpty()
                || precio <= 0 || stock < 0) {
            System.out.println("Datos invalidos.");
            return;
        }

        Producto producto = new Producto(
                codigo, nombre, precio, stock
        );

        if (inventario.agregarProducto(producto)) {
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("Ya existe un producto con ese codigo.");
        }
    }

    private void buscarProducto() {

        System.out.print("\nIngrese el codigo del producto: ");
        String codigo = scanner.nextLine();

        Producto producto = inventario.buscarPorCodigo(codigo);

        if (producto != null) {
            System.out.println("\nProducto encontrado:");
            System.out.println(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void eliminarProducto() {

        System.out.print("\nIngrese el codigo del producto: ");
        String codigo = scanner.nextLine();

        if (inventario.eliminarProducto(codigo)) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    private void recuperarProducto() {

        int posicion = leerEntero(
                "\nIngrese la posicion del producto (0 en adelante): "
        );

        Producto producto = inventario.obtenerProducto(posicion);

        if (producto != null) {
            System.out.println("Producto recuperado:");
            System.out.println(producto);
        } else {
            System.out.println("Posicion fuera de rango.");
        }
    }

    private int leerEntero(String mensaje) {

        while (true) {

            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero entero valido.");
            }
        }
    }

    private double leerDouble(String mensaje) {

        while (true) {

            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }
}
