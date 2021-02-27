package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class Competencia extends vehiculo implements Serializable
{
    private String escuderia;

    public Competencia(String escuderia, String numeroChasis, String color, String numeroMotor) 
    {
        super(numeroChasis, color, numeroMotor);
        this.escuderia = escuderia;
    }

    public String getEscuderia() 
    {
        return escuderia;
    }

    public void setEscuderia(String escuderia) 
    {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() 
    {
        return "Competencia{" + "escuderia=" + escuderia + '}';
    }
}
