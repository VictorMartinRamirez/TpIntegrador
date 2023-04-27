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
            List<Partido> listaPartidos = new ArrayList<>();

        List<Equipo> listaEquipos = new ArrayList<>();
        List<Integer> listaGoles = new ArrayList<>();
        //List<Partido> listaPartidos = new ArrayList<>();
        List<Ronda> listaRondas = new ArrayList<>();
        List<Pronostico> listaPronosticos = new ArrayList<>();

        //CREAR LOS PARTIDOS
        boolean primeraLinea = true;
        int numeroRonda = 0;
        for (String linea : Files.readAllLines(Paths.get("archivoscsv\\resultados.csv"))) {
            if (!primeraLinea) {
                String[] nombreEquipo = linea.split(";");
                for (String nombreEquipos : nombreEquipo) {
                    if (nombreEquipos.length() > 1) {
                        Equipo equipo = new Equipo(nombreEquipos);
                        //System.out.println(equipo);
                        listaEquipos.add(equipo);
                    } else {
                        try {
                            Integer cantGoles = Integer.valueOf(nombreEquipos);
                            //System.out.println(cantGoles);
                            listaGoles.add(cantGoles);
                        } catch (NumberFormatException exception) {
                            System.out.println("el caracter no se puede convertir en entero");
                        }
                    }
                }
            }
            primeraLinea = false;
        }
               /*System.out.println("La listaEquipos es de tamaño: " + listaEquipos.size());
                  System.out.println("La listaGoles es de tamaño: " + listaGoles.size());*/
               
        for (int i = 0; i < 11; i = i + 2) {
            if (i % 4 == 0) {
                numeroRonda++;
            }
            Partido partido = new Partido(listaEquipos.get(i), listaGoles.get(i), listaEquipos.get(i + 1), listaGoles.get(i + 1), numeroRonda);
            partido.decidirResultado();
            //System.out.println(partido);
            listaPartidos.add(partido);
            
           
            if (listaPartidos.size() == 2) {
                Ronda ronda = new Ronda(numeroRonda, listaPartidos);
                listaRondas.add(ronda);
                System.out.println(ronda);
               listaPartidos.clear();
            }
        }

    }
}

// CREO LOS PRONOSTICOS

/*primeraLinea = true;
Pronostico pronostico = new Pronostico() ;
int i=0;
for (String linea : Files.readAllLines(Paths.get("archivoscsv\\pronosticos.csv"))){
if (!primeraLinea) {

String[] datos = linea.split(";");

if (datos[2].toUpperCase().equals("X")) {
pronostico.setResultado(ResultadoEnum.GANA_EQUIPO_1);
} else if (datos[3].toUpperCase().equals("X")) {
pronostico.setResultado(ResultadoEnum.EMPATE);
} else if (datos[4].toUpperCase().equals("X")) {
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

System.out.println("Puntaje: " + puntaje);*/
