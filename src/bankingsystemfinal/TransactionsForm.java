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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
/**
 *
 * @author seifelmosalamy
 */
public class TransactionsForm extends JFrame
{
 
    
            private JButton TranseferToAnotherAccountSameCurrency ;
            private JButton TranseferToAnotherAccountCrossCurrency ;
            private JButton TranseferToOwnAccountSameCurrency ;
            private JButton TranseferToOwnAccountCrossCurrency ;

    public TransactionsForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1500,500);
        setLayout(null);
       
        JPanel panel = new JPanel ();
         panel.setBackground(new Color(36 , 63 , 50));
         panel.setSize(1500,500);
         panel.setLayout(new FlowLayout());
        
        TranseferToAnotherAccountSameCurrency = new  JButton ("Transfer to another account same currency ");
       TranseferToAnotherAccountCrossCurrency = new  JButton ("Transfer to another account cross currency");
        TranseferToOwnAccountSameCurrency= new  JButton ("Transfer to own account same currency");
         TranseferToOwnAccountCrossCurrency = new  JButton ("Transfer to own account cross currency");
            
        TranseferToAnotherAccountSameCurrency.setBounds(labelbounds);
        TranseferToAnotherAccountCrossCurrency.setBounds(labelbounds);
        TranseferToOwnAccountSameCurrency.setBounds(labelbounds);
        TranseferToOwnAccountCrossCurrency.setBounds(labelbounds);
        
        //lisnters
        TranseferToAnotherAccountCrossCurrency.addActionListener(new ButtonWatcher());
        
        panel.add( TranseferToAnotherAccountSameCurrency );
        panel.add( TranseferToAnotherAccountCrossCurrency);
        panel.add(TranseferToOwnAccountSameCurrency);
        panel.add(TranseferToOwnAccountCrossCurrency);
        add(panel);
        setVisible(true);
    
    }
            
            private class ButtonWatcher implements ActionListener
            {
                    
                
        public void actionPerformed(ActionEvent ae) {
          Object ButtonPressed =  ae.getSource();
            if(ButtonPressed.equals(TranseferToAnotherAccountCrossCurrency))
            {
                
            }
            else if (ButtonPressed.equals(TranseferToAnotherAccountSameCurrency))
            {
                
            }
            else if (ButtonPressed.equals(TranseferToOwnAccountCrossCurrency))
            {
                
                
            }
            else if (ButtonPressed.equals(TranseferToOwnAccountSameCurrency))
            {
                
            }
        }
                
            }
        
    
}
