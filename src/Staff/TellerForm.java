/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Staff;

import bankingsystemfinal.AccountInfo;
import static bankingsystemfinal.BankingSystemFinal.a;
import java.awt.*;
import static bankingsystemfinal.BankingSystemFinal.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import static bankingsystemfinal.BankingSystemFinal.x;
import static bankingsystemfinal.BankingSystemFinal.a;
import static bankingsystemfinal.BankingSystemFinal.list1;
import javax.swing.*;

/**
 *
 * @author seifelmosalamy
 */
public class TellerForm extends JFrame implements Serializable{
    public TellerForm() {
        
         setSize(800,400);
       setTitle("Teller");
        setLayout(null);
        initComponents();
    }
    
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton5;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JTextField jTextField1;
    private JLabel jLabel2;
        private JTextField jTextField2;
        private JButton jButton4;
private JLabel jLabel3;
private JLabel jLabel4;
    private void initComponents() {

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jTextField1 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton5=new JButton();
jLabel2=new JLabel();
jTextField2=new JTextField();
jButton4=new JButton();
jLabel3=new JLabel();
jLabel4=new JLabel();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1000,500);
        jPanel1.setBackground(new Color(20, 100, 190));
        

        jLabel1.setBounds(10,20,100,25);
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setText("Enter username: ");

        jTextField1.setBounds(200,20,250,25);
       

        jButton1.setBounds(200,100,90,25);
        jButton1.setText("Withdraw");

        jButton2.setBounds(340,100,90,25);
        jButton2.setText("Deposit");

        jButton3.setBounds(360,300,90,25);
        jButton3.setText("Ok");
        jButton3.addActionListener(new ButtonWatcher());
        jButton2.addActionListener(new ButtonWatcher());
        jButton1.addActionListener(new ButtonWatcher());
        jLabel2.setBounds(10, 60, 150, 25);
        jLabel2.setForeground(Color.WHITE);
jLabel2.setText("Enter the amount: ");
        
        jTextField2.setBounds(200,50,250 ,25 );
        
        jButton4.setText("Search");
        jButton4.setBounds(480,30,100,50);
        
        
        jButton5.setText("Close");
                jButton5.addActionListener(new ButtonWatcher());
                        jButton5.setBounds(470,300,90,25);


             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);
             jPanel1.add(jLabel1);
             jPanel1.add(jTextField1); 
             jPanel1.add(jButton3);
             jPanel1.add(jLabel2);
             jPanel1.add(jTextField2);
             jPanel1.add(jButton3);
             jPanel1.add(jButton4);
             jPanel1.add(jLabel4);
             jPanel1.add(jLabel3);
             jPanel1.add(jButton5);
    }
    
    private class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
Object buttonpressed=e.getSource();
if(buttonpressed.equals(jButton5)){
CloseFrame();
}
if(buttonpressed.equals(jButton4)){
 


for (AccountInfo searchitem : x){
  String y=jTextField1.getText();

        

}


}
        
    
else if(buttonpressed.equals(jButton2))
        { 
// deposit
              int amount= Integer.parseInt(jTextField2.getText()); 
              JOptionPane jop=new JOptionPane();
    jop.showMessageDialog(null,amount+" deposit done" );
amount=amount-a.getBankAmount();
    jop.showMessageDialog(null,"your current amount is "+amount);
    

} 
else if(buttonpressed.equals(jButton1)){
int amount=Integer.parseInt(jTextField2.getText());
JOptionPane jop=new JOptionPane();
    jop.showMessageDialog(null,amount+" withdraw done" );
    amount =amount+a.getBankAmount();
    
        jop.showMessageDialog(null,"your current amount is "+amount);

    

}
        }

}
public void CloseFrame(){
    super.dispose();
}

}
