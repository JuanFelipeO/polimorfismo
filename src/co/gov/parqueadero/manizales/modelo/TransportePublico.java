package co.gov.parqueadero.manizales.modelo;


import co.gov.parqueadero.manizales.modelo.Transporte;
import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class TransportePublico extends Transporte implements Serializable
{
    private short numeroPasajeros;

    public TransportePublico(short numeroPasajeros, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) 
    {
        super(capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.numeroPasajeros = numeroPasajeros;
    }

    public short getNumeroPasajeros() 
    {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(short numeroPasajeros) 
    {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() 
    {
        return "TransportePublico{" + "numeroPasajeros=" + numeroPasajeros + '}';
    } 
}
