/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;

import java.util.List;

/* @author VICTOR MARTIN RAMÍREZ */

public class Ronda {
     int numeroRonda;
     List<Partido> listaPartidos;

    public Ronda(int numeroRonda, List<Partido> listaPartidos) {
        this.numeroRonda = numeroRonda;
        this.listaPartidos = listaPartidos;
    }

   
    

    @Override
    public String toString() {
        return "Ronda{" + "numeroRonda=" + numeroRonda + ", partidos=" + listaPartidos + '}';
    }

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public List<Partido> getlistaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidosPorRonda(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    
   public void agregarPartido(Partido partido){
        this.listaPartidos.add(partido);
    }
    
    public static boolean buscarCoincidenciaRonda(List<Ronda> listaRonda, int numeroRonda){
        boolean coincide = false;
        for(Ronda r : listaRonda){
            if(r.getNumeroRonda() == numeroRonda){
                coincide = true;
            } 
        }
        return coincide;
    }
    
    public static Ronda buscarRondaPorNumero(List<Ronda> listaRonda, int numeroRonda){
        Ronda rondaEncontrada = listaRonda.stream()
                .filter(ronda -> ronda.getNumeroRonda() == numeroRonda)
                .findAny()
                .orElse(null);
        return rondaEncontrada;
    }
    }
    
 
   
   