package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class Camion extends TransporteCarga implements Serializable
{
    private byte numerosEjes;

    public Camion(byte numerosEjes, String transportadora, boolean registroMinisterrio, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) 
    {
        super(transportadora, registroMinisterrio, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.numerosEjes = numerosEjes;
    }

    public byte getNumerosEjes() 
    {
        return numerosEjes;
    }

    public void setNumerosEjes(byte numerosEjes) 
    {
        this.numerosEjes = numerosEjes;
    }

    @Override
    public String toString() 
    {
        return "Camion{" + "numerosEjes=" + numerosEjes + '}';
    }
    
    
}
