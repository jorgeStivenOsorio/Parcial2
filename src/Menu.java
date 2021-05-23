public class Menu {

    public final void showMenuPrincipal() {
        System.out.println("""
                ****************************************************************
                *                                                              *
                *              BIENVENIDO AL GARAJE                            *
                *                                                              *
                ****************************************************************
                *                                                              *
                * Que accion desea realizar:                                   *
                * 1) Agregar vehiculo.                                         *
                * 2) Mostrar garaje.                                           *
                * 3) Vehiculo mas rapido.                                      *
                * 4) Vehiculo mas lento.                                       *
                * 5) Ordenar los vehiculos del mas rapido al mas lento.        *
                * 6) Mostrar vehiculos negros y azules.                        *
                * 7) Concatenar las referencias de vehiculos BLANCOS y Verdes. *
                * 8) Salir.                                                    *
                ****************************************************************
                """);
    }

    public final void showMenuVehiculos() {
        System.out.println("""
                ***************************************************
                * Seleccione el tipo de vehiculo a agregar:       *
                ***************************************************
                *                                                 *
                * 1) Avion                                        *
                * 2) Yate                                         *
                * 3) Carro                                        *
                * 4) Salir                                        *
                ***************************************************
                """);
    }


}
