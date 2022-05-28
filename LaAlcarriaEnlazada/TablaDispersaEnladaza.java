package LaAlcarriaEnlazada;

public class TablaDispersaEnlazada{
    static final int M = 101;
    private Elemento [] tabla;
    private int numElementos;
    // operaciones

    public TablaDispersaEnlazada(){ // constructor
        tabla = new Elemento[M];
        for (int k = 0; k < M; k++)
        tabla[k] = null;
        numElementos = 0;
    }

    public void insertar(TipoSocio s){
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }

    boolean conforme(TipoSocio a);

    public void eliminar(int codigo){
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null){
            // no está vacía
            Elemento anterior, actual;
            anterior = null;
            actual = tabla[posicion];
            while ((actual.sgte != null) && actual.getSocio().getCodigo() != codigo){
            anterior = actual;
            actual = actual.sgte;
            }
            if (actual.getSocio().getCodigo() != codigo)
            System.out.println("No se encuentra en la tabla el socio " + codigo);
            else if (conforme (actual.getSocio())){
            //se retira el nodo
            if (anterior == null) // primer nodo
            tabla[posicion] = actual.sgte;
            else
            anterior.sgte = actual.sgte;
            actual = null;
            numElementos--;
            }
        }
    }

    public Elemento buscar(int codigo){
        Elemento p = null;
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null){
            p = tabla[posicion];
            while ((p.sgte != null) && p.socio.codigo != codigo)
            p = p.sgte;
            if (p.socio.codigo != codigo)
            p = null;
        }
        return p;
    }
}
