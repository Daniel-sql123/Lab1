/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author dashs
 */
public class Medico {
    private int id;
    private int numMed;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private String especialidad;
    private double salario;

    public int getId() {
        return id;
    }

    public int getNumMed() {
        return numMed;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Medico(int id, int numMed, String nombre, LocalDate fechaNacimiento, String telefono, String correo, String especialidad, double salario) {
        this.id = id;
        this.numMed = numMed;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Medico() {
        this(0, 0, "", LocalDate.now(), "","","",0.0);
    }

    @Override
    public String toString() {
        return "Medico{" + "id=" + id + ", numMed=" + numMed + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", correo=" + correo + ", especialidad=" + especialidad + ", salario=" + salario + '}';
    }
    
    
}
