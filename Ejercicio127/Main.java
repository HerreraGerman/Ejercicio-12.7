package Ejercicio127;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
        TipoSocio socio;

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
                    socio = new TipoSocio();
                    tabla.insertar(socio);
                    break;
                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.print("Ingrese el socio que desea buscar: ");
                    try {
                        TipoSocio buscado = tabla.buscar(entrada.readLine());
                        buscado.muestra();
                    } catch (Exception e) {
                        System.out.println("El socio no existe, ingrese nuevamente o presione 0 para salir");
                    }
                    break;
                case "3":
                    System.out.print("\033[H\033[2J");
                    System.out.print("Ingrese el código del socio que desea eliminar: ");
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
        System.out.println("1) Insertar Socio");
        System.out.println("2) Buscar Socio");
        System.out.println("3) Eliminar Socio");
        System.out.println("4) Salir");
    }
}