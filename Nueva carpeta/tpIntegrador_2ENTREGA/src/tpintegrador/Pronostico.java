/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;

/* @author VICTOR MARTIN RAMÍREZ */
public class Pronostico {

    private Partido partido;
    private ResultadoEnum resultado;
    private Ronda ronda;

    public Pronostico() {

    }

    @Override
    public String toString() {
        return "Pronostico{" + "partido=" + partido + ", resultado=" + resultado + '}';
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    public static int calcularPuntajePronostico(Partido partido, Pronostico pronostico) {
        int puntaje = 0;
        if (partido.getResultado() == pronostico.getResultado()) {
            puntaje += 1;
        }
        return puntaje;
    }
}
