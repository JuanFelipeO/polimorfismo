package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class Bus extends TransportePublico implements Serializable
{
    private String[] rutas;

    public Bus(String[] rutas, short numeroPasajeros, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) 
    {
        super(numeroPasajeros, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.rutas = rutas;
    }

    public String[] getRutas() 
    {
        return rutas;
    }

    public void setRutas(String[] rutas) 
    {
        this.rutas = rutas;
    }

    @Override
    public String toString() 
    {
        return "Bus{" + "rutas=" + rutas + '}';
    }    
}
