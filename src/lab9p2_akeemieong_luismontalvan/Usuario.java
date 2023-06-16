/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_akeemieong_luismontalvan;

/**
 *
 * @author luism
 */
public class Usuario {
    private String Nombre, contrasena;
    private int NumCuenta;

    public Usuario() {
    }

    public Usuario(String Nombre, String contrasena, int NumCuenta) {
        this.Nombre = Nombre;
        this.contrasena = contrasena;
        this.NumCuenta = NumCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", contrasena=" + contrasena + ", NumCuenta=" + NumCuenta + '}';
    }
    
}
