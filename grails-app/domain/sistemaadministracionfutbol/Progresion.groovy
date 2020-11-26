package sistemaadministracionfutbol

class Progresion {
    String progresionDelResultado = ""

    static constraints = {
    }

    def agregarGol(String equipo, String nombre, String minuto){
        this.progresionDelResultado = this.progresionDelResultado + "Gol de ${equipo} convertido por ${nombre} en el minuto ${minuto}"
    }
}
