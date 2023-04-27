/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;

/* @author VICTOR MARTIN RAMÍREZ */

public class Partido {
  
    private Equipo equipo1;
    private Integer golesEquipo1;
    private Equipo equipo2;
    private Integer golesEquipo2;
    private ResultadoEnum resultado;

    public Partido(Equipo equipo1, Integer golesEquipo1, Equipo equipo2, Integer golesEquipo2) {
        this.equipo1 = equipo1;
        this.golesEquipo1 = golesEquipo1;
        this.equipo2 = equipo2;
        this.golesEquipo2 = golesEquipo2;
    }

    @Override
    public String toString() {
        return "Partido{" + "equipo1=" + equipo1 + ", golesEquipo1=" + golesEquipo1 + ", equipo2=" + equipo2 + ", golesEquipo2=" + golesEquipo2 + ", resultado=" + resultado + '}';
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(Integer golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(Integer golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }
    
    

    public void decidirResultado() {
        if (this.golesEquipo1 > this.golesEquipo2) {
            this.resultado = ResultadoEnum.GANA_EQUIPO_1;
        } else if (this.golesEquipo1 < this.golesEquipo2) {
            this.resultado = ResultadoEnum.GANA_EQUIPO_2;
        } else {
            this.resultado = ResultadoEnum.EMPATE;
        }
    }  
}
