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
public class GraphicsClass extends JPanel implements Runnable 
{

    public GraphicsClass() 
    {
        setSize(1000,1000);
          
        setVisible(true);
    }
public void paintComponent(Graphics g)
{     
   
    super.paintComponents(g);
    g.setColor(Color.cyan);
    //Statistics for males in loans application form
   g.fillRect(100 , 500 - (ctrm + 50) /* da el minus*/ , 60, 1000 /*da yekbar fashkh */);
    g.fillRect(200 , 500 , 60, 1000 );
    //Statistics for males in loans application form
    g.setColor(Color.pink);
    g.fillRect(500 ,500-(ctrf + 50) , 60, 1000);
     
}

    public void run ()
    {
           GraphicsClass graphics = new GraphicsClass();
        JFrame jf = new JFrame();
        JFrame jf2 = new JFrame();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setSize(1000,1000);
        jf.setTitle("Painting Statistics");
    
        jf.add(graphics);
        
        PaintingForWorkers pfw=new PaintingForWorkers();
        jf.setVisible(true);
        jf2.setSize(1000,1000);
        jf2.setTitle("Painting Statistics");
        jf2.add(pfw);
        repaint ();
        jf2.setVisible(true);
        
        
    }
            
            
        
}

