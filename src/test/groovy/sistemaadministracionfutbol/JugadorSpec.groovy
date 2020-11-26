package sistemaadministracionfutbol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class JugadorSpec extends Specification implements DomainUnitTest<Jugador> {

    def setup() {
    }

    def cleanup() {
    }

    void "crear jugador con nombre"(){
        Jugador jugador = new Jugador(nombre:"Pablo");
        expect:""
            jugador.nombre == "Pablo"
    }
}
