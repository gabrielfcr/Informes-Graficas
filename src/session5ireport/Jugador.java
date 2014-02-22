/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session5ireport;

/**
 *
 * @author Gabriel
 */
public class Jugador {
    private int id;
    private String nombre;
    private String consola;

    public Jugador(int id, String nobre, String consola) {
        this.id = id;
        this.nombre = nobre;
        this.consola = consola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nobre) {
        this.nombre = nobre;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
    
    
}
