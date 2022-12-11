
import java.util.Iterator;

public class Censo {

    public static Integer contarClientePresenteLanchonete(Lanchonete lanchonete) {
        int quantidade = 0;
        for (Cliente cliente : lanchonete) {
            if (cliente.isPresente()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesLanchonete(Lanchonete lanchonete) {
        int quantidade = 0;
        for (Iterator a = lanchonete.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
