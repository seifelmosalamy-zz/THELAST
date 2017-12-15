package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.a;
import static bankingsystemfinal.BankingSystemFinal.hm;
import static bankingsystemfinal.BankingSystemFinal.list1;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import static bankingsystemfinal.BankingSystemFinal.x;
import javax.swing.*;
import java.io.Serializable;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
/**
 *
 * @author new
 */
public class LoginForm extends JFrame implements Serializable{
    public LoginForm() {
     
            
       initComponents();
       addComponent();
       
       
    }
    
    private char[]pw ;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JPanel jPanel1;
    private JComboBox jComboBox1; 
    
    
    private void initComponents() {
         setSize(1000,700);
       setTitle("Login");
       
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        
        jPanel1.setBackground(new Color(20, 100, 190));
     //set  names   
        jLabel1 = new JLabel("Login");
        jLabel2 = new JLabel("User Name");
        jLabel3 = new JLabel("Password");
        jLabel4 = new JLabel("Login as ");
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButton1 = new JButton("SignIn");
        jButton2 = new JButton("SignUp");
        jComboBox1 = new JComboBox ();
         jComboBox1.addItem("CustomerAgent");
        jComboBox1.addItem("Teller");
        jComboBox1.addItem("Manager");
        jComboBox1.addItem("LoanOfficer");
        jComboBox1.addItem("Customer");
        jComboBox1.setBounds(80,140,120,25);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       //set bounds
        jLabel1.setBounds(250,10,50,30);
        jLabel1.setForeground(Color.white);
        jLabel2.setBounds(10,40,80,50);
        jLabel2.setForeground(Color.white);
        jLabel3.setBounds(10,90,80,50);
        jLabel3.setForeground(Color.white);
        jLabel4.setBounds(10,125,80,50);
        jLabel4.setForeground(Color.white);
        
        jTextField1.setBounds(80,50,120,25);
        jPasswordField1.setBounds(80,100,120,25);
        
        jButton1.setBounds(10,200,80,30);
        jButton2.setBounds(120,200,80,30);
        
            
              
    }

    private void addComponent() {
 
             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);           
             jPanel1.add(jLabel1);
             jPanel1.add(jLabel2);
             jPanel1.add(jLabel3);                                              
             jPanel1.add(jPasswordField1);
             jPanel1.add(jTextField1);  
             jPanel1.add(jComboBox1);
             jPanel1.add(jLabel4);
             jButton1.addActionListener(new ButtonWatcher());
    }
    
        private class ButtonWatcher implements ActionListener 
  {

                public void actionPerformed(ActionEvent e) 
                {
                Object buttonpressed = e.getSource();
                if (buttonpressed.equals(jButton1)){
                String UN = jTextField1.getText();
              
               for (AccountInfo HashMapItem : x){
               hm.put(HashMapItem.getUserName(), HashMapItem.getPassword());
               }
                for (AccountInfo searchitem : x){
  
                if (searchitem.getUserName().equals(UN)){
                   char hashpw[]= hm.get(UN);
                   System.out.print(hashpw);
                    
                   char loginformpw[]=jPasswordField1.getPassword();
                
                if((hashpw.length < loginformpw.length) || (hashpw.length >loginformpw.length) ){
                JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
                
                }
                else{  
                    int found=0;
                    for(int i=0;i<hashpw.length ;i++){
                 if(hashpw[i]==loginformpw[i]) {
                    found++;
                     
                 }          
                  } 
                  if(found==hashpw.length){
                  
                  JOptionPane.showMessageDialog(null, "Valid");
                  }  else{
                      JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
                  }
                
                 
                }}
                else{
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
                        }}
            
                    
                }}
                }
                
                }
                  
                
