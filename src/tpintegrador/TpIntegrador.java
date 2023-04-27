package tpintegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static tpintegrador.ResultadoEnum.EMPATE;
import static tpintegrador.ResultadoEnum.GANA_EQUIPO_1;
import static tpintegrador.ResultadoEnum.GANA_EQUIPO_2;

/* @author VICTOR MARTIN RAMÍREZ */
public class TpIntegrador {

    public static void main(String[] args) throws IOException {

        List<Equipo> listaEquipos = new ArrayList<>();
        List<Integer> listaGoles = new ArrayList<>();
        List<Partido> listaPartidos = new ArrayList<>();
        List<Pronostico> listaPronosticos = new ArrayList<>();
   
        //CREAR LOS PARTIDOS
        boolean primeraLinea = true;
        for (String linea : Files.readAllLines(Paths.get("archivoscsv\\resultados.csv"))) {
            if (!primeraLinea) {String[] nombreEquipo = linea.split(";");
            for (String nombreEquipos : nombreEquipo) {
            if (nombreEquipos.length() > 1) {
                        Equipo equipo = new Equipo(nombreEquipos);
                        listaEquipos.add(equipo);
                    } else {
                        Integer cantGoles = Integer.valueOf(nombreEquipos);
                        listaGoles.add(cantGoles);}
                 } }primeraLinea = false;}
        
        for (int i = 0; i < 3; i = i + 2) {
            Partido partido = new Partido(listaEquipos.get(i), listaGoles.get(i), listaEquipos.get(i + 1), listaGoles.get(i + 1));
            partido.decidirResultado();
            listaPartidos.add(partido);}
        
// CREO LOS PRONOSTICOS

primeraLinea = true; 
Pronostico pronostico = new Pronostico() ;
  int i=0;      
        for (String linea : Files.readAllLines(Paths.get("archivoscsv\\pronostico.csv"))){
          if (!primeraLinea) {

       String[] datos = linea.split(";");

                if (datos[1].toUpperCase().equals("X")) {
                    pronostico.setResultado(ResultadoEnum.GANA_EQUIPO_1);
                } else if (datos[2].toUpperCase().equals("X")) {
                    pronostico.setResultado(ResultadoEnum.EMPATE);
                } else if (datos[3].toUpperCase().equals("X")) {
                    pronostico.setResultado(ResultadoEnum.GANA_EQUIPO_2);}
                
                pronostico.setPartido(listaPartidos.get(i-1));
                listaPronosticos.add(pronostico);
                   System.out.println(pronostico);} 
 i++;
 primeraLinea = false;}
        
        
        
        
   // COMPARO LOS RESULTADOS DE CADA PARTIDO CON LOS PRONOSTICOS     
  int puntaje = 0;
  for ( i = 0; i < listaPartidos.size(); i++) 
  {puntaje = Pronostico.calcularPuntajePronostico(listaPartidos.get(i), listaPronosticos.get(i));}
  
  System.out.println("Puntaje: " + puntaje);
     
 }
}

      