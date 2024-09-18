/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Citas {
    private int id;
    private LocalDate fechaCita;
    private String estado;

    public Citas(int id, LocalDate fechaCita, String estado) {
        this.id = id;
        this.fechaCita = fechaCita;
        this.estado = estado;
    }

    public Citas() {
        this (0, LocalDate.now(), "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Citas{" + "id=" + id + ", fechaCita=" + fechaCita + ", estado=" + estado + '}';
    }  
    
}
