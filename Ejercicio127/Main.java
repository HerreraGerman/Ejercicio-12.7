package Ejercicio127;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, codigo, edad, dia, mes, año;
        String nombre;
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();

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
                    TipoSocio socio = new TipoSocio();
                    tabla.insertar(socio);
                    break;
                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.print("Ingrese el socio que desea buscar: ");
                    try {
                        codigo = entrada.nextInt();
                        sc.nextLine();
                        tabla.eliminar(codigo);
                    } catch (Exception e) {
                        System.out.println("El socio no existe, ingrese nuevamente o presione 0 para salir");
                    }
                    break;
                case "3":
                    System.out.print("\033[H\033[2J");
                    System.out.print("Ingrese el código del socio que desea eliminar: ");
                    try {
                        codigo = entrada.nextInt();
                        sc.nextLine();
                        tabla.buscar(codigo).getSocio().mostrar();
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