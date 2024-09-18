/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controllers.CustomerController;
import Models.CustomerList;
import Models.CustomertSet;
import Views.CustomerConsole;
import Views.MenuFrame;

/**
 *
 * @author jprod
 */
public class CustomerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        CustomertSet model = new CustomertSet();
        CustomerConsole view = new CustomerConsole();
        CustomerController controller = new CustomerController(model,view);
        //CustomerFrame Frame = new CustomerFrame();
        view.setController(controller);
        //view.CustomerFrame(Frame);
        MenuFrame fram = new MenuFrame();
        fram.setVisible(true);
        view.show();
       
    }
    
}
