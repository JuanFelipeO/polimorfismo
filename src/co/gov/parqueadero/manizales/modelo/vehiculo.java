package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author PIPE
 */
public class vehiculo extends Object implements Serializable 
{
    private String numeroChasis;
    private String color;
    private String numeroMotor;

    public vehiculo(String numeroChasis, String color, String numeroMotor) 
    {
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroChasis() 
    {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) 
    {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getNumeroMotor() 
    {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) 
    {
        this.numeroMotor = numeroMotor;
    }

    @Override
    public String toString() 
    {
        return "vehiculo{" + "numeroChasis=" + numeroChasis + ", color=" + color + ", numeroMotor=" + numeroMotor + '}';
    }   
}
