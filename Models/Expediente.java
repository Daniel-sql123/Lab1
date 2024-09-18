/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Expediente {
    
    private String nombre;
    private LocalDate edad;
    private CitasListas<Citas> historial;

    
    public Expediente(String nombrePaciente, LocalDate edadPaciente) {
        this.nombre = nombrePaciente;
        this.edad = edadPaciente;
        this.historial = new ArrayList<>();
    }
    
     public void agregarCita(Citas cita) {
        historial.add(cita);
    }
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public <any> getHistorial() {
        return historial;
    }
    
    
    
}
