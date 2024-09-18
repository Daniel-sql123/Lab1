/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class CitasList implements IManager<Citas> {

    private final List<Citas> citasList;

    public CitasList() {
        citasList = new ArrayList<>();
    }

    @Override
    public boolean add(Citas citas) {
        Citas current = get(citas);
        if (current != null) {
            return false;
        }
        citasList.add(citas);
        return true;
    }

    @Override
    public Citas get(Citas citas) {
        for (Citas current : citasList) {
            if (current.getId() == citas.getId()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean set(Citas citas) {
        if (citas != null) {
            Citas current = get(citas);
            if (current != null) {
                citasList.remove(current);
                citasList.add(citas);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Citas citas) {
        if (citas != null && get(citas) != null) {
            citasList.remove(citas);
            return true;
        }
        return false;
    }

    @Override
    public List getAll() {
        if (citasList.isEmpty()) {
            return null;
        }
        return citasList;
    }
}
    