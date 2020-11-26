package sistemaadministracionfutbol

class Jugadores {
    List listaJugadores = []
    static constraints = {
    }
    def agregarJugadorALista(Jugador jugador){
        if (!(listaJugadores.contains(jugador))){
            listaJugadores.add(jugador)
        }
        
    }

    def ordenarPorGoles(){
        listaJugadores.sort { it.goles }
    }
    def ordenarPorAsistencias(){
        listaJugadores.sort { it.asistencias }
    }

}
