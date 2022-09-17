package main;

import java.util.Scanner;

public class VistaPrincipal {

    private final Tienda tienda;
    private final Sistema sistema;

    private final VistaVenta vistaVenta;


    public VistaPrincipal(Tienda tienda, Sistema sistema, VistaVenta vistaVenta) {
        this.tienda = tienda;
        this.sistema = sistema;
        this.vistaVenta = vistaVenta;
    }


    Scanner teclado = new Scanner(System.in);

    public void MostrarMenuPrincipal() {
        int opcion = 0;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1 Crear Vendedor");
            System.out.println("2 Crear Producto");
            System.out.println("3 Iniciar Venta");
            System.out.println("4 Calcular Comisiones");
            System.out.println("0 salir");

            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("ingrese codigo vendedor: ");
                    Integer codigoVendedor = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("ingrese nombre vendedor: ");
                    String nombreVendedor = teclado.nextLine();
                    System.out.print("ingrese sueldo vendedor: ");
                    Double sueldoVendedor = teclado.nextDouble();
                    sistema.CrearVendedor(codigoVendedor, nombreVendedor, sueldoVendedor);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("ingrese codigo producto: ");
                    Integer codigoProducto = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("ingrese nombre producto: ");
                    String nombreProducto = teclado.nextLine();
                    System.out.print("ingrese precio producto: ");
                    Double precioProducto = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("ingrese la categoria del producto: ");
                    String categoria = teclado.nextLine();
                    sistema.CrearProducto(codigoProducto, nombreProducto, precioProducto, categoria);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Accediendo al menu ventas");
                    vistaVenta.MostrarMenuVenta();

                    System.out.println("");



                    break;

                case 4:
                    System.out.println("Mostrando comisiones");
                    System.out.print("Comisiones por ventas: ");
                    System.out.println(tienda.CalcularComisiones());
                    break;

                case 0:
                    System.out.println("salir");
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }


        } while (opcion != 0);


    }

}

