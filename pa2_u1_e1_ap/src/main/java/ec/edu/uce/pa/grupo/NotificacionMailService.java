package ec.edu.uce.pa.grupo;

import ec.edu.uce.pa.grupo.interceptores.Notificacion;
import jakarta.inject.Singleton;

@Singleton
public class NotificacionMailService {

    
    public void enviarNotificacion(String mensaje) {

        System.out.println("Enviando notifiacion: " + mensaje);
        
    }
}
