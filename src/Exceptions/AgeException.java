/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Seif Elmosalamy
 */
public class AgeException extends Exception{

    public AgeException() 
    {
        super();
         JOptionPane.showMessageDialog(null, "Please enter valid age");
        
    }

    public AgeException(String message) {
        super(message);
         JOptionPane.showMessageDialog(null, "Please enter valid age");
        
        
    }

}
