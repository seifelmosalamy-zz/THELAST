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
import static bankingsystemfinal.BankingSystemFinal.list1;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import static bankingsystemfinal.BankingSystemFinal.x;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
            private JFrame jf ;
            private JTextField text1; 
            private JTextField text2 ; 
            private JLabel lbl2 ; 
            private JButton Transefer ; 
            

    public TransactionsForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1500,500);
        setLayout(null);
       
        JPanel panel = new JPanel ();
         panel.setBackground(new Color(36 , 63 , 50));
         panel.setSize(1500,500);
         panel.setLayout(new FlowLayout());
         jf=new JFrame("Transfers");
         jf.setSize(500,500);
        
        TranseferToAnotherAccountSameCurrency = new  JButton ("Transfer to another account same currency ");
       TranseferToAnotherAccountCrossCurrency = new  JButton ("Transfer to another account cross currency");
        TranseferToOwnAccountSameCurrency= new  JButton ("Transfer to own account same currency");
         TranseferToOwnAccountCrossCurrency = new  JButton ("Transfer to own account cross currency");
         text1 = new JTextField("Enter user here");
         Transefer = new JButton("Transefer");
         Transefer.setBounds(labelbounds);
         Transefer.addActionListener(new ButtonWatcher());
            text2 = new JTextField("Enter second user here");
            lbl2 = new JLabel("Please Select a source Account");
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
          if(ButtonPressed.equals(Transefer))
          {
              String us =text1.getText();
              String us2 =text2.getText();
              String sourcecurrency2="";
              String sourcecurrency="";
                     try
                       {
                           for (AccountInfo searchitem : x){
  
                if (searchitem.getUserName().equals(us)){
                 
                     sourcecurrency = searchitem.getAccountCurrencyType();}
                if (searchitem.getUserName().equals(us2)){
                   
                         sourcecurrency2 = searchitem.getAccountCurrencyType();
                    }
                    
                   
                        
                
                }}catch(Exception n){
                   
                }
                     if(!sourcecurrency.equals(sourcecurrency2)&& !sourcecurrency.equals("") && !sourcecurrency2.equals("")){
                     JOptionPane.showMessageDialog(null, "Transfer Done");
                     }
                     else{JOptionPane.showMessageDialog(null, "Cannot be Transfered or Not Found ");}
          }
            if(ButtonPressed.equals(TranseferToAnotherAccountCrossCurrency))
            {
                
                    JLabel lbl1= new JLabel("Please Select a source Account");
                    lbl1.setBounds(labelbounds);
                    text1.setBounds(textfieldbounds);
                    lbl2.setBounds(labelbounds);
                    text2.setBounds(textfieldbounds);
                    jf.add(lbl1);
                    jf.add(text1);
                    jf.add(lbl2);
                    jf.add(text2);
                    jf.add(Transefer);
                    jf.setLayout(new FlowLayout());
                    
                    jf.setVisible(true);
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
