public class OpcionesDelMenu extends Menu {
    Garaje garaje = new Garaje();
    Datos datos = new Datos();
    private Garaje listTemp;

    public void Menu() {
        boolean salir = true;
        do {
                showMenuPrincipal();
                switch (Validador.validarOpcion()) {
                    case 1:
                        listTemp = datos.datosOpcionAgregar(garaje);
                        garaje = listTemp;
                        break;
                    case 2:
                        garaje.mostrarGaraje();
                        break;
                    case 3:
                        salir = false;
                }

        } while (salir);


    }


}
