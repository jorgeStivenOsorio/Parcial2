
public class OpcionesDelMenu extends Menu {
    Garaje garaje = new Garaje();
    Datos datos = new Datos();

    public void menu() {
        boolean salir = true;
        do {
                showMenuPrincipal();
                switch (Validador.validarOpcion()) {
                    case 1 -> garaje = datos.datosOpcionAgregar(garaje);
                    case 2 -> garaje.mostrarGaraje();
                    case 3 -> garaje.vehiculoMasRapido();
                    case 4 -> garaje.vehiculoMasLento();
                    case 5 -> garaje.ordenarVehiculos();
                    case 6 -> garaje.vehiculosNegrosAzules();
                    case 7 -> garaje.referenciaConcatenada();
                    case 8 -> salir = false;

                }

        } while (salir);


    }


}
