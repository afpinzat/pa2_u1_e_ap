package ec.edu.uce.pa.grupo.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;

@ApplicationScoped  
public class DescuentoVip implements Descuento {

    @Override
    public double calcularDescuento(double precio) {
        // TODO Auto-generated method stub
        double descuento = precio * 0.10;
        return descuento;
    }

}
