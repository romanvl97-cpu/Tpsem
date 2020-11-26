package sistemaadministracionfutbol

class Jugador {
    String nombre
    int edad
    String posicion
    int altura
    int peso
    int goles = 0
    int presencias = 0
    int asistencias = 0
    static constraints = {
    }

    def sumarGol(){
        this.goles = this.goles + 1
    }
    def sumarPresencia(){
        this.presencia = this.presencia +1
    }
    def sumarAsistencia(){
        this.asistencias = this.asistencias + 1
    }

}
