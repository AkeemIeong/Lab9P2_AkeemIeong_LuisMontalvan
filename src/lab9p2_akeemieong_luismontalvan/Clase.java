/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_akeemieong_luismontalvan;

/**
 *
 * @author SURFACEB2I7
 */
public class Clase extends Asignatura{
    private double precio;

    public Clase() {
        super();
    }

    public Clase(double precio) {
        this.precio = precio;
    }

    public Clase(double precio, String nombre, String docente, String modalidad, String dias, String horario, int codigoA, int codigoS, int unidVal, int aula, int edificio, int alumnos) {
        super(nombre, docente, modalidad, dias, horario, codigoA, codigoS, unidVal, aula, edificio, alumnos);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Clase{" + "precio=" + precio + '}';
    }
    
    
}
