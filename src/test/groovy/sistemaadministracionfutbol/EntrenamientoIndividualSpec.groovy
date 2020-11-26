package sistemaadministracionfutbol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EntrenamientoIndividualSpec extends Specification implements DomainUnitTest<EntrenamientoIndividual> {

    def setup() {
    }

    def cleanup() {
    }

    void "creacion de entrenamiento individual con dia asignado"(){
        EntrenamientoIndividual entrenamientoIndividual = new EntrenamientoIndividual(dia:"lunes");
        expect:""
            entrenamientoIndividual.getDia()=="lunes"

    }

    void"creacion de entrenamiento individual con actividad asignada"(){
        EntrenamientoIndividual entrenamientoIndividual = new EntrenamientoIndividual(actividad:"3 vueltas al parque");
        expect:""
            entrenamientoIndividual.getActividad()== "3 vueltas al parque"
    }
    void"creacion de entrenamiento individual con actividad asignada, luego editada"(){
        EntrenamientoIndividual entrenamientoIndividual = new EntrenamientoIndividual(actividad:"3 vueltas al parque");
        entrenamientoIndividual.editarActividad("pelota")
        expect:""
            entrenamientoIndividual.getActividad()== "pelota"
    }


}
