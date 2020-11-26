package sistemaadministracionfutbol

class EntrenamientoIndividual {
    String dia
    int asistentcia
    List jugadoresPresentes
    String actividad 

    EntrenamientoIndividual(asistencia, jugadoresPresentes){
        this.asistencia = 0;
        this.jugadoresPresentes = []
    }

    static constraints = {
    }
    def getDia(){
        this.dia
    }

    def getAsistencia(){
        this.asistencia
    }


    def sumarAsistencia(){
        this.asistencia = this.asistencia + 1
    }
    def restarAsistencia(){
        this.asistencia = this.asistencia - 1
    }

    def editarActividad(String actividad){
        this.actividad = actividad
    }
}
