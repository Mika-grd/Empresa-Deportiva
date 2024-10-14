/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Atleta;
import co.edu.uniquindio.poo.model.EmpresaDeportiva;
import co.edu.uniquindio.poo.model.Equipo;
import co.edu.uniquindio.poo.model.EventoDeportivo;
import co.edu.uniquindio.poo.model.Participante;
import co.edu.uniquindio.poo.model.TipoEvento;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAtletasEventoNatacionCompeticion() {
        LOG.info("Iniciado test testAtletasEventoNatacionCompeticion");
        EmpresaDeportiva em = new EmpresaDeportiva("prueba");
        EventoDeportivo evento1 = new EventoDeportivo("x", LocalDate.of(2006, 05, 23), null, null, "natación", TipoEvento.COMPETICION);
        Atleta at1 = new Atleta(null, null, null, null, 0);
        Atleta at2 = new Atleta(null, null, null, null, 0);
        em.añadirAtleta(at2);
        em.añadirAtleta(at1);
        Participante p1 = new Participante(0, null, at2);
        Participante p2 = new Participante(0, null, at1);
        evento1.añadirParticipante(p2);
        evento1.añadirParticipante(p1);
        Equipo eq = new Equipo(null, null);
        eq.añadirAtleta(at2);
        eq.añadirAtleta(at1);
        em.añadirEventoDeportivo(evento1);
        evento1.añadirEquipo(eq);

        LinkedList<Atleta> listaEsperada = Arrays.asList( at2, at1).stream().collect(Collectors.toCollection(LinkedList::new));

        assertEquals(listaEsperada, em.atletasEventoNatacion());
        LOG.info("Finalizando test testAtletasEventoNatacionCompeticion");
    }
}
