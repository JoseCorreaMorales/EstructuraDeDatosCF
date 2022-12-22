package estructuradedatoscodigofacilito;

public class ListaEnlazada {

    protected Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    /**
     *
     * @param dato
     * @return
     */
    public ListaEnlazada agregarInicio(int dato) {
          Nodo nuevo;
          nuevo = new Nodo(dato);
          nuevo.ref = primero;
          return this;
          
    }

    @SuppressWarnings("empty-statement")
    public void agregarFinal(int dato) {
        Nodo nuevoFinal = new Nodo(dato);
        nuevoFinal = null;
        
        if (primero == null) {
            primero = nuevoFinal;
            return;
        }
        Nodo temporal;
        for (temporal=primero; temporal.getRef() != null; temporal=temporal.getRef());
            temporal.setRef(nuevoFinal);
        
        
        
    }

    public void buscar() {
    }

    public void eliminar() {
    }

    public void verLista() {
        Nodo nodoVer;
        nodoVer = primero;
        while (nodoVer != null){
            System.out.println(nodoVer.dato);
            nodoVer = nodoVer.ref;

        }
    }

}
