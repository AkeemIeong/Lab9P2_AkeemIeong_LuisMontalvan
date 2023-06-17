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
public class Asignatura {
    private String nombre,docente,modalidad,dias,horario;
    private int codigoA,codigoS,unidVal,aula,edificio,alumnos;
    

    public Asignatura() {
    }

    public Asignatura(String nombre, String docente, String modalidad, String dias, String horario, int codigoA, int codigoS, int unidVal, int aula, int edificio, int alumnos) {
        this.nombre = nombre;
        this.docente = docente;
        this.modalidad = modalidad;
        this.dias = dias;
        this.horario = horario;
        this.codigoA = codigoA;
        this.codigoS = codigoS;
        this.unidVal = unidVal;
        this.aula = aula;
        this.edificio = edificio;
        this.alumnos = alumnos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(int codigoA) {
        this.codigoA = codigoA;
    }

    public int getCodigoS() {
        return codigoS;
    }

    public void setCodigoS(int codigoS) {
        this.codigoS = codigoS;
    }

    public int getUnidVal() {
        return unidVal;
    }

    public void setUnidVal(int unidVal) {
        this.unidVal = unidVal;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", docente=" + docente + ", modalidad=" + modalidad + ", dias=" + dias + ", horario=" + horario + ", codigoA=" + codigoA + ", codigoS=" + codigoS + ", unidVal=" + unidVal + ", aula=" + aula + ", edificio=" + edificio + '}';
    }
    
}
