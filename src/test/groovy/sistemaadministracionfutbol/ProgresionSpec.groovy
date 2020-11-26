package sistemaadministracionfutbol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ProgresionSpec extends Specification implements DomainUnitTest<Progresion> {

    def setup() {
    }

    def cleanup() {
    }

    void "agregar evento lo interpola bien"(){
        Progresion progresion = new Progresion();
        progresion.agregarGol("Napoli","Maradona","10");
        expect:""
            progresion.progresionDelResultado == "Gol de Napoli convertido por Maradona en el minuto 10"

    }

}
