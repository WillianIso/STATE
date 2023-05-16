import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    Carta carta;

    @BeforeEach
    public void setUp() {
        carta = new Carta();
    }

    @Test
    public void naoDeveEntregarCartaSemTransito() {
        carta.setEstado(CartaEstadoEnviada.getInstance());
        assertFalse(carta.entregue());
    }

    @Test
    public void naoDeveEntregarCartaNaoEnviada() {
        carta.setEstado(CartaEstadoEntregue.getInstance());
        assertFalse(carta.enviada());
    }


    @Test
    public void deveEntregarCartaEmTransito() {
        carta.setEstado(CartaEstadoEmTransito.getInstance());
        assertTrue(carta.entregue());
        assertEquals(CartaEstadoEntregue.getInstance(), carta.getEstado());
    }

}
