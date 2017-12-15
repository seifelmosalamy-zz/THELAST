/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
/**
 *
 * @author seifelmosalamy
 */
public class TransactionsForm extends JFrame
{
 
    
            private JButton ttaas;
            private JButton ttaac;
            private JButton ttoas;
            private JButton ttoac;

    public TransactionsForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1500,500);
        setLayout(null);
       
        JPanel panel = new JPanel ();
         panel.setBackground(new Color(36 , 63 , 50));
         panel.setSize(1500,500);
         panel.setLayout(new FlowLayout());
        
        ttaas = new  JButton ("Transfer to another account same currency ");
        ttaac = new  JButton ("Transfer to another account cross currency");
        ttoas = new  JButton ("Transfer to own account same currency");
        ttoac = new  JButton ("Transfer to own account cross currency");
            
        ttaas.setBounds(labelbounds);
        ttaac.setBounds(labelbounds);
        ttoas.setBounds(labelbounds);
        ttoac.setBounds(labelbounds);
        
        panel.add(ttaas);
        panel.add(ttaac);
        panel.add(ttoas);
        panel.add(ttoac);
        add(panel);
        setVisible(true);
    
    }
            
            
        
    
}
