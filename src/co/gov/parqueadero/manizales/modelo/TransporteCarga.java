package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class TransporteCarga extends Transporte implements Serializable
{
    private String transportadora;
    private boolean registroMinisterrio;

    public TransporteCarga(String transportadora, boolean registroMinisterrio, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.transportadora = transportadora;
        this.registroMinisterrio = registroMinisterrio;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public boolean isRegistroMinisterrio() {
        return registroMinisterrio;
    }

    public void setRegistroMinisterrio(boolean registroMinisterrio) {
        this.registroMinisterrio = registroMinisterrio;
    }

    @Override
    public String toString() {
        return "Carga{" + "transportadora=" + transportadora + ", registroMinisterrio=" + registroMinisterrio + '}';
    }    
}
