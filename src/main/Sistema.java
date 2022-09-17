package main;

import java.util.HashSet;
import java.util.Set;

public class Sistema {

    private Set<Vendedor> vendedores = new HashSet<Vendedor>();
    private Set<Producto> productos = new HashSet<Producto>();

    public void CrearVendedor(Integer codigo, String nombre, Double sueldo) {
        Vendedor vendedor = new Vendedor(codigo, nombre, sueldo);
        vendedores.add(vendedor);
    }

    public void ListarVendedores() {
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor);
        }
    }

    public Set<Vendedor> ObtenerVendedores() {
        return vendedores;
    }

    public Set<Producto> ObtenerProductos() {
        return productos;
    }

    public void CrearProducto(Integer codigo, String nombre, Double precio, String categoria) {
        Producto producto = new Producto(codigo, nombre, precio, categoria);
        productos.add(producto);
    }

    public void ListarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

}
