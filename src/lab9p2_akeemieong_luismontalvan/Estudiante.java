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
public class Estudiante extends Usuario{
   private String Carrera;
   private int indice,descuento,clasesA;
   private boolean beca;
   ArrayList<Asignatura>clases = new ArrayList();

    public Estudiante() {
    }

    public Estudiante(String Carrera, int indice, int descuento, int clasesA, boolean beca, String Nombre, String contrasena, int NumCuenta) {
        super(Nombre, contrasena, NumCuenta);
        this.Carrera = Carrera;
        this.indice = indice;
        this.descuento = descuento;
        this.clasesA = clasesA;
        this.beca = beca;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getClasesA() {
        return clasesA;
    }

    public void setClasesA(int clasesA) {
        this.clasesA = clasesA;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Carrera=" + Carrera + ", indice=" + indice + ", descuento=" + descuento + ", clasesA=" + clasesA + ", beca=" + beca + '}';
    }
   
}
