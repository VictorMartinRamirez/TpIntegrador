/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;

/* @author VICTOR MARTIN RAMÍREZ */

public class Equipo {
       private String nombre, descripcion;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public Equipo(){
        
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
}
