/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.ctrf;
import static bankingsystemfinal.BankingSystemFinal.ctrm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Seif Elmosalamy
 */
public class GraphicsClass extends JPanel 
{

    public GraphicsClass() 
    {
        
        setSize(1000,1000);
         Thread gameThread = new Thread() {
         public void run() {
         
            while (true) {
  
        try {
                  Thread.sleep(1000 / 100);  // milliseconds
               } catch (InterruptedException ex) { 

        
          
      
               }}}};}
           
           
    
        public void paintComponent(Graphics g)
        {   
    super.paintComponent(g);
   
   
    
    g.setColor(Color.cyan);
    //Statistics for males in loans application form
    g.fillRect(100 , (500 - (ctrm + 50)) /* da el minus*/ , 60, 1000 /*da yekbar fashkh */);

    //Statistics for females in loans application form
    g.setColor(Color.pink);
    g.fillRect(500 ,(500-(ctrf + 50)) , 60, 1000);
    
     
        }}       

 
  