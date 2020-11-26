package sistemaadministracionfutbol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EntrenamientosSpec extends Specification implements DomainUnitTest<Entrenamientos> {

    def setup() {
    }

    def cleanup() {
    }


    void "crear entrenamientos con un mes asignado"(){
        Entrenamientos entrenamientos = new Entrenamientos(mes:"marzo", entrenamientos:[]);

        expect:"bien"
            entrenamientos.mes == "marzo"
    }

    void "modificar mes de entrenamientos"(){
        Entrenamientos entrenamientos = new Entrenamientos(mes:"marzo", entrenamientos:[]);
        entrenamientos.modificarMes("agosto")
        expect:"bien"
            entrenamientos.mes == "agosto"
    }


}
