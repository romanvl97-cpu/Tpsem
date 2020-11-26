package sistemaadministracionfutbol

class Entrenamientos {
    String mes
    EntrenamientoIndividual[] entrenamientos
    static constraints = {
    }

    def modificarMes(String mes){
        this.mes = mes
    }
    def agregarEntrenamiento(){
        EntrenamientoIndividual entrenamiento = new EntrenamientoIndividual();
        this.entrenamientos.add(entrenamiento)
    }
}
