package Ejercicio127;

public class TipoSocio{

    class Fecha{
        int dia;
        int mes;
        int anno;

        Fecha (int d, int m, int a){
            dia = d;
            mes = m;
            anno = a;
        }
        
        public String toString(){
            return " " + dia + "-" + mes + "-" + anno;
        }
    };

    int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public TipoSocio(String n, int c, int e, int d, int m, int a){
        codigo = c;
        nombre = n;
        edad = e;
        f = new Fecha(d, m, a);
    }

    public int getCodigo(){
        return codigo;
    }
    // métodos de interfaz

    public void muestra(){
        System.out.println("Socio " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha: " + f);
        }
};