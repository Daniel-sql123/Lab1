/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CustomertSet implements IManager<Customer>{

    private HashSet <Customer> set;

    public CustomertSet() {
        set = new HashSet<>();
    }
    
   
    
    @Override
    public boolean add(Customer element) {
      return set.add(element);
      
    }

    @Override
    public Customer get(Customer element) {
        for (Customer curret : set){
            if (curret.getId()==element.getId())
                return curret;
        }
        return null;
    }

    @Override
    public boolean set(Customer element) {
         for (Customer curret : set){
            if (curret.getId()==element.getId())
               set.remove(curret);
               set.add(element);
               return true;
        }
       return false; 
    }

    @Override
    public boolean remove(Customer element) {
            for (Customer curret : set){
            if (curret.getId()==element.getId())
            return set.remove(curret);
               
        }
            return false;
    }

    @Override
    public List getAll() {
        return new ArrayList<Customer>(set);
    }
    
}
