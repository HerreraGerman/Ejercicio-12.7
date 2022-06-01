package Ejercicio127;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        String n;
        int opcion, c, d, m, a, e;
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();

        //Menú
        System.out.print("\033[H\033[2J");
        System.out.println("Bienvenido");

        do{
            opcionesMenu();
            opcion = Integer.parseInt(entrada.nextLine());
            switch(opcion){
               case 1:
                    System.out.println("Ingrese codigo de Socio");
                    c = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese nombre de Socio");
                    n = entrada.nextLine();
                    System.out.println("Ingrese edad de Socio");
                    e = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese dia de Socio");
                    d = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese mes de Socio");
                    m = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese año de Socio");
                    a = Integer.parseInt(entrada.nextLine());
                    TipoSocio socio = new TipoSocio(n, c, e, d, m, a);
                    tabla.insertar(socio);
                    break;
               case 2:
                    System.out.println("Ingrese el codigo para eliminar a un socio:");
                    c = Integer.parseInt(entrada.nextLine());
                    tabla.eliminar(c);
                    System.out.println("Socio eliminado");
                    break;
               case 3:
                    System.out.println("Ingrese el codigo para buscar un socio:");
                    c = Integer.parseInt(entrada.nextLine());
                    tabla.buscar(c).getSocio().muestra();;
                    break;
                case 4:
                    System.out.println("See u next time!");
                    break;
                default:
                    System.out.println("Elija una opción de la lista");
                    break;
                }
        }while(opcion < 4);

        entrada.close();

    }

    public static void opcionesMenu(){
        System.out.println("Seleccione una opción:");
        System.out.println("1) Insertar Socio");
        System.out.println("2) Eliminar Socio");
        System.out.println("3) Buscar Socio");
        System.out.println("4) Salir");
    }   

}