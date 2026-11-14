package ec.edu.uce.pa.grupo;

import ec.edu.uce.pa.grupo.extensiones.DescuentoNormal;
import ec.edu.uce.pa.grupo.extensiones.DescuentoTerceraEdad;
import ec.edu.uce.pa.grupo.extensiones.DescuentoVip;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    PedidoService pedidoService;

    @Inject 
    DescuentoNormal descuentoNormal;

    @Inject 
    DescuentoVip descuentoVip;

    @Inject 
    DescuentoTerceraEdad descuentoTerceraEdad;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("hello, Quarkus!");
        System.out.println("INICIO_EVALUACION");
        Pedido p1 = new Pedido("P001", "Laptop", 100);
        Pedido p2 = new Pedido("P002", "P2", 200);
        Pedido p3 = new Pedido("P003", "P3", 300);

        this.pedidoService.procesarPedido(p1, descuentoNormal);
        this.pedidoService.procesarPedido(p2, descuentoVip);
        this.pedidoService.procesarPedido(p3, descuentoTerceraEdad);
        System.out.println("FIN_EVALUACION");
        return 0;
    }

}
