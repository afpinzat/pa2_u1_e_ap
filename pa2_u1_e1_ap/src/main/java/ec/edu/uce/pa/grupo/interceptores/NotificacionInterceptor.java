package ec.edu.uce.pa.grupo.interceptores;

import ec.edu.uce.pa.grupo.NotificacionMailService;
import ec.edu.uce.pa.grupo.Pedido;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Notificacion
@Interceptor
public class NotificacionInterceptor {

    @Inject
    private NotificacionMailService notificacionMailService;

   @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        Object resultado = context.proceed();
        this.notificacionMailService.enviarNotificacion("NOTIFICACION:");
        return resultado;
    }

}
