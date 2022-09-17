package main;

import java.util.Objects;

public class Producto {

    private Integer codigo;
    private String nombre;
    private Double precio;
    private String categoria;

    public Producto(Integer codigo, String nombre, Double precio, String categoria){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria= categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo.equals(producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
