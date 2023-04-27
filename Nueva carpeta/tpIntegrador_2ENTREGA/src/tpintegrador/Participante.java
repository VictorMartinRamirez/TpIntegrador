/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;

import java.util.List;

/* @author VICTOR MARTIN RAMÍREZ */
public class Participante {

    String nombre;
    Integer puntaje;
    Integer cantidadAciertos;
    List<Pronostico> Pronosticos;

    public Participante(String nombre, Integer puntaje, Integer cantidadAciertos, List<Pronostico> Pronosticos) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.cantidadAciertos = cantidadAciertos;
        this.Pronosticos = Pronosticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getCantidadAciertos() {
        return cantidadAciertos;
    }

    public void setCantidadAciertos(Integer cantidadAciertos) {
        this.cantidadAciertos = cantidadAciertos;
    }

    public List<Pronostico> getPronosticos() {
        return Pronosticos;
    }

    public void setPronosticos(List<Pronostico> Pronosticos) {
        this.Pronosticos = Pronosticos;
    }
    
    
    
    
    
    

}
