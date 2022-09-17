package main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tienda {

    private String nombre;
    private Vendedor vendedor;
    private Set<Producto> productos = new HashSet<Producto>();

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void AgregarProducto(Producto producto) {

        productos.add(producto);
    }

    public void RegistrarVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void ListarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Double CalcularComisiones() {
        Double sumaPrecios = 0.0;
        Double comision = 0.0;
        if (productos.size() < 2) {
            for (Producto producto : productos) {
                sumaPrecios += producto.getPrecio();
            }
            comision = sumaPrecios * 0.05;
        } else if (productos.size() >= 2) {
            for (Producto producto : productos) {
                sumaPrecios += producto.getPrecio();
            }
            comision = sumaPrecios * 0.10;

        }return comision;

    }


    public Set<Producto> ObtenerProductos() {
        return productos;
    }

}
