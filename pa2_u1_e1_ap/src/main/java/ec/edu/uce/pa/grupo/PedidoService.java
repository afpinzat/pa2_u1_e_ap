package ec.edu.uce.pa.grupo;

import ec.edu.uce.pa.grupo.extensiones.Descuento;
import ec.edu.uce.pa.grupo.interceptores.MedirTiempo;
import ec.edu.uce.pa.grupo.interceptores.Notificacion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class PedidoService {

    @MedirTiempo 
    @Notificacion 
    public void procesarPedido (Pedido pedido, Descuento descuento){
        System.out.println("Procesar pedido: " + pedido.getCodigo() + "-" + pedido.getProducto());
        double totalFinal = descuento.calcularDescuento(pedido.getPrecio());
        System.out.println("Total Final: " + totalFinal);
    }
}
