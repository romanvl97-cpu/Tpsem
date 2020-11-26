package sistemaadministracionfutbol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class JugadoresSpec extends Specification implements DomainUnitTest<Jugadores> {

    def setup() {
    }

    def cleanup() {
    }

    void "agregar jugador jugadores"(){

        Jugador jugador = new Jugador(); 
        Jugadores jugadores = new Jugadores();
        jugadores.agregarJugadorALista(jugador);
        expect:"bien"
            jugadores.listaJugadores.size() == 1

    }
    void "agregar dos veces el mismo jugador a jugadores, solo lo conserva una vez"(){

        Jugador jugador = new Jugador(); 
        Jugadores jugadores = new Jugadores();
        jugadores.agregarJugadorALista(jugador);
        jugadores.agregarJugadorALista(jugador);
                expect:"bien"
            jugadores.listaJugadores.size() == 1

    }

        void "agregar dos jugador distintintos a jugadores"(){

        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador(); 
        Jugadores jugadores = new Jugadores();
        jugadores.agregarJugadorALista(jugador1);
        jugadores.agregarJugadorALista(jugador2);
                expect:"bien"
            jugadores.listaJugadores.size() == 2

    }

        void"""agregar 3 jugadores a jugadores con  distinta cantidad de goles
                y luego ordenarlos por cantidad de goles
         """(){
            Jugador jugador1 = new Jugador(goles:1);
            Jugador jugador2 = new Jugador(goles:3);
            Jugador jugador3 = new Jugador(goles:2)
            Jugadores jugadores = new Jugadores();
            jugadores.agregarJugadorALista(jugador1);
            jugadores.agregarJugadorALista(jugador2);
            jugadores.agregarJugadorALista(jugador3);
            jugadores.ordenarPorGoles();

            expect:""
                jugadores.listaJugadores.get(0).goles == 1
                jugadores.listaJugadores.get(1).goles == 2
                jugadores.listaJugadores.get(2).goles == 3



        }
    
}
