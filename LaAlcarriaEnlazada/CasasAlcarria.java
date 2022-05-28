package LaAlcarriaEnlazada;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CasasAlcarria{
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        TablaDispersa tabla = new TablaDispersa();
        CasaRural casa;

        System.out.print("\033[H\033[2J");
        System.out.println("Bienvenido");

        do {
            opcionesMenu();
            try {
                opcion = entrada.readLine();
            } catch (IOException e) {
                System.out.println("Elija una opción de la lista.");
            }
            switch (opcion) {
                case "1":
                    System.out.print("\033[H\033[2J");
                    casa = new CasaRural();
                    tabla.insertar(casa);
                    break;
                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.print("Ingrese la casa que desea buscar: ");
                    try {
                        CasaRural buscado = tabla.buscar(entrada.readLine());
                        buscado.muestra();
                    } catch (Exception e) {
                        System.out.println("La casa no existe, ingrese nuevamente o presione 0 para salir");
                    }
                    break;
                case "3":
                    System.out.print("\033[H\033[2J");
                    System.out.print("Ingrese el código de la casa que desea eliminar: ");
                    try {
                        tabla.eliminar(entrada.readLine());
                    } catch (IOException e) {
                        System.out.println("Código incorrecto, ingrese nuevamente o presione 0 para salir");
                    }
                    break;
                case "4":
                    System.out.print("\033[H\033[2J");
                    System.out.println("See u next time!");
                    break;
            }
        } while (!opcion.equals("4"));
    }

    public static void opcionesMenu(){
        System.out.println("Seleccione una opción:");
        System.out.println("1) Insertar Casa");
        System.out.println("2) Buscar Casa");
        System.out.println("3) Eliminar Casa");
        System.out.println("4) Salir");
    }
}