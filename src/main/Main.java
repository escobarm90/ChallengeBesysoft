package main;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi tienda");
        Sistema sistema = new Sistema();
        VistaVenta vistaVenta = new VistaVenta(tienda, sistema);

        VistaPrincipal vistaPrincipal = new VistaPrincipal(tienda, sistema, vistaVenta);

        vistaPrincipal.MostrarMenuPrincipal();

    }
}
