package ec.edu.uce.pa.grupo.interceptores;

import ec.edu.uce.pa.grupo.Pedido;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
public class MedirTiempoInterceptor {

   @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        Long inicio = System.currentTimeMillis();
        Object resultado = context.proceed();
        Long fin = System.currentTimeMillis();

        Pedido pedido = (Pedido) context.getParameters()[0];


        System.out.println("DURACION: "+pedido.getCodigo()+"|" + (fin - inicio) + " ms");
        System.out.println("TIEMPO: "+ pedido+"|OK");
        return resultado;
    }
}
