package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class Avion extends TransporteCarga implements Serializable
{
    private String fuselaje;
    private short altidudMaxima;

    public Avion(String fuselaje, short altidudMaxima, String transportadora, boolean registroMinisterrio, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) 
    {
        super(transportadora, registroMinisterrio, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.fuselaje = fuselaje;
        this.altidudMaxima = altidudMaxima;
    }

    public String getFuselaje() 
    {
        return fuselaje;
    }

    public void setFuselaje(String fuselaje) 
    {
        this.fuselaje = fuselaje;
    }

    public short getAltidudMaxima() 
    {
        return altidudMaxima;
    }

    public void setAltidudMaxima(short altidudMaxima) 
    {
        this.altidudMaxima = altidudMaxima;
    }

    @Override
    public String toString() 
    {
        return "Avion{" + "fuselaje=" + fuselaje + ", altidudMaxima=" + altidudMaxima + '}';
    }
}
