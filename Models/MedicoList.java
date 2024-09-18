/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dashs
 */
public class MedicoList implements IManager<Medico> {

    private final List<Medico> medicosLista;

    public MedicoList() {
        medicosLista = new ArrayList<>();
    }

    @Override
    public boolean add(Medico medico) {
        Medico current = get(medico);
        if(current!=null)
            return false;
        medicosLista.add(medico);
        return true;
    }

    @Override
    public Medico get(Medico medico) {
        for (Medico current : medicosLista) {
            if (current.getId() == medico.getId()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean set(Medico medico) {
        if (medico != null) {
            Medico current=get(medico);
            if (current != null){
                medicosLista.remove(current);
                medicosLista.add(medico);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Medico medico) {
        if (medico != null && get(medico)!=null) {
            medicosLista.remove(medico);
            return true;
        }
        return false;
    }

    @Override
    public List<Medico> getAll() {
        if (medicosLista.isEmpty()) {
            return null;
        }
        return medicosLista;
    }
    
}
