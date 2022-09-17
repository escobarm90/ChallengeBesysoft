package main;
import java.util.Objects;


public class Vendedor {
    private Integer codigo;
    private String nombre;
    private Double sueldo;


    public Vendedor(Integer codigo, String nombre, Double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return codigo.equals(vendedor.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public Integer getCodigo() {
        return codigo;
    }

}


