package main;

import java.util.Scanner;
import java.util.Set;

public class VistaVenta {

    private final Tienda tienda;
    private final Sistema sistema;

    public VistaVenta(Tienda tienda, Sistema sistema) {
        this.tienda = tienda;
        this.sistema = sistema;
    }

    Scanner teclado = new Scanner(System.in);


    public void MostrarMenuVenta() {
        int opcion = 0;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1 Seleccionar vendedor");
            System.out.println("2 Listar Productos");
            System.out.println("3 Buscar productos por nombre");
            System.out.println("4 Buscar productos por categoria");

            System.out.println("0 salir");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    sistema.ListarVendedores();
                    int opcion2 = 0;
                    do {
                        System.out.print("Ingrese codigo del vendedor: ");
                        Integer codigoVendedor = teclado.nextInt();
                        for (Vendedor vendedor : sistema.ObtenerVendedores()) {
                            if (vendedor.getCodigo().equals(codigoVendedor)) {
                                tienda.RegistrarVendedor(vendedor);
                                break;
                            }
                        }
                        System.out.print("1: Continuar // 2: Salir");
                        opcion2 = teclado.nextInt();
                        teclado.nextLine();
                    } while (opcion2 != 1);
                    System.out.println("");

                    break;

                case 2:
                    sistema.ListarProductos();
                    int opcion3 = 0;
                    do {
                        System.out.print("Ingrese codigo del producto a comprar: ");
                        Integer codigoProducto = teclado.nextInt();
                        for (Producto producto : sistema.ObtenerProductos()) {
                            if (producto.getCodigo().equals(codigoProducto)) {
                                tienda.AgregarProducto(producto);
                            }
                        }
                        System.out.print("1: Continuar // 2: Salir");
                        opcion3 = teclado.nextInt();
                    } while (opcion3 != 1);
                    System.out.println("");
                    break;
                case 3:
                    do {
                        System.out.print("Ingrese nombre del producto a buscar: ");
                        String nombreProducto = teclado.nextLine();
                        for (Producto producto : sistema.ObtenerProductos()) {
                            if (producto.getNombre().equals(nombreProducto)) {
                                System.out.println(producto);
                                System.out.println("Desea seleccionar el producto?\n Si = 1 \n No = 0");
                                Integer seleccion = teclado.nextInt();
                                if (seleccion == 1) {
                                    tienda.AgregarProducto(producto);
                                }
                            } else {
                                System.out.println("Producto no encontrado");
                            }
                        }


                        System.out.print("1: Continuar // 2: Salir");
                        opcion2 = teclado.nextInt();
                    } while (opcion2 != 1);
                    System.out.println("");
                    break;
                case 4:
                    do {
                        System.out.print("Ingrese nombre de la categoria a buscar: ");
                        String nombreCategoria = teclado.nextLine();
                        for (Producto producto : sistema.ObtenerProductos()) {
                            if (producto.getCategoria().equals(nombreCategoria)) {
                                System.out.println(producto);
                                System.out.println("Desea seleccionar el producto?\n Si = 1 \n No = 0");
                                Integer seleccion = teclado.nextInt();
                                if (seleccion == 1) {
                                    tienda.AgregarProducto(producto);
                                }
                            } else {
                                System.out.println("Categoria no encontrada");
                            }
                        }

                            System.out.print("1: Continuar");
                            System.out.print("2: Salir");
                            opcion2 = teclado.nextInt();
                        }
                        while (opcion2 != 1) ;
                        System.out.println("");
                        break;
                        case 0:
                            System.out.println("salir");
                            break;

                        default:
                            System.out.println("opcion no valida");
                            break;
                    }


            } while (opcion != 0) ;
        }
    }
