/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_akeemieong_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Maestro extends Usuario{
    private String nacionalidad, titulo;
    ArrayList<Asignatura> clases = new ArrayList();

    public Maestro() {
        super();
    }

    @Override
    public String toString() {
        return "Maestro{" + "nacionalidad=" + nacionalidad + ", titulo=" + titulo + ", clases=" + clases + '}';
    }

    public Maestro(String nacionalidad, String titulo, String Nombre, String contrasena, int NumCuenta) {
        super(Nombre, contrasena, NumCuenta);
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getClases() {
        return clases;
    }

    public void setClases(ArrayList<String> clases) {
        this.clases = clases;
    }
    
}
