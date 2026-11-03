package pe.edu.isil;

import java.util.Collections;
import java.util.Comparator;

public class GestorColecciones {

    private Inventario inventario;

    public GestorColecciones(Inventario inventario) {
        this.inventario = inventario;
    }

    public void ordenarPorPrecio() {

        Collections.sort(
            inventario.getProductos(),
            Comparator.comparingDouble(Producto::getPrecio)
        );

        System.out.println("\nProductos ordenados por precio:");
        inventario.listarProductos();
    }
}
