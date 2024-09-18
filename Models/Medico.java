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
public class Medico extends Persona{
    private int numMed;
    private String especialidad;
    private double salario;


    public int getNumMed() {
        return numMed;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public Medico(int id, int numMed, String nombre, LocalDate fechaNacimiento, String telefono, String correo, String especialidad, double salario) {
        super(id, nombre, fechaNacimiento, telefono, correo);
        this.numMed = numMed;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Medico() {
        this(0, 0, "", LocalDate.now(), "","","",0.0);
    }

    @Override
    public String toString() {
        return "Medico{" + "numMed=" + numMed + ", especialidad=" + especialidad + ", salario=" + salario + '}';
    }
    
    
}
