/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatoscodigofacilito;

/**
 *
 * @author Jose
 */
public class Main {

    public static void main(String[] args) {

        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarInicio(1);
        listaEnlazada.agregarInicio(2);
        listaEnlazada.agregarInicio(3);
        listaEnlazada.agregarInicio(4);

        listaEnlazada.agregarFinal(5);
        listaEnlazada.verLista();

    }
}
