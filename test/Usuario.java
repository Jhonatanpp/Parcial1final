/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Jhonatan
 */
public class Usuario {
    private String Pedro;
    private int id;
    private final String nombre;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}


