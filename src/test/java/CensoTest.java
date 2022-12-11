
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarClientesPresentesLanchonete() {
        Lanchonete lanchonete = new Lanchonete(
                new Cliente("Marco Antonio", true),
                new Cliente("Ivan", true),
                new Cliente("Deoclecio", false),
                new Cliente("Bia", true)
        );
        assertEquals(3, Censo.contarClientePresenteLanchonete(lanchonete));
    }

    @Test
    void deveContarTotalClientesLanchonete() {
        Lanchonete lanchonete = new Lanchonete(
                new Cliente("Marco Antonio", true),
                new Cliente("Ivan", true),
                new Cliente("Deoclecio", false),
                new Cliente("Bia", true)
        );
        assertEquals(4, Censo.contarTotalClientesLanchonete(lanchonete));
    }
}