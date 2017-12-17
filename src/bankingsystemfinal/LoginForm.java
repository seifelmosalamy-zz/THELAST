package bankingsystemfinal;

import Staff.CustomerServiceAgentForm;
import Staff.LoanOfficerForm;
import Staff.ManagerForm;
import Staff.TellerForm;
import static bankingsystemfinal.BankingSystemFinal.CustomerAgentList;
import static bankingsystemfinal.BankingSystemFinal.LoanOfficer;
import static bankingsystemfinal.BankingSystemFinal.Manager;
import static bankingsystemfinal.BankingSystemFinal.Teller;
import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.a;
import static bankingsystemfinal.BankingSystemFinal.hm;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import static bankingsystemfinal.BankingSystemFinal.x;
import javax.swing.*;
import java.io.Serializable;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author new
 */
public class LoginForm extends JFrame implements Serializable{
    
    CustomerServiceAgentForm csa = new CustomerServiceAgentForm();
     TellerForm Tf = new TellerForm();
      ManagerForm mF = new ManagerForm();
      LoanOfficerForm Lof = new LoanOfficerForm();
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
         setSize(500   ,500);
       setTitle("Login");
       
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        
        jPanel1.setBackground(new Color(20, 100, 190));
     //set  names   
        jLabel1 = new JLabel("Login");
        jLabel2 = new JLabel("User Name");
        jLabel3 = new JLabel("Password");
        jLabel4 = new JLabel("Login as ");
        jTextField1 = new JTextField("Enter Username");
        jPasswordField1 = new JPasswordField("Enter password");
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
        jLabel1.setBounds(150,10,50,30);
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
             jButton2.addActionListener(new ButtonWatcher());
             jTextField1.addMouseListener(new MouseListner());
               jPasswordField1.addMouseListener(new MouseListner());
    }
    
    private class MouseListner implements MouseListener
    {
        Object b=  new Object();
         @Override
        public void mouseClicked(MouseEvent me) {
          b = me.getSource();
          if(b.equals(jTextField1))
            jTextField1.setText("");
          if(b.equals(jPasswordField1))
            jPasswordField1.setText(""); 
        }

        @Override
        public void mousePressed(MouseEvent me) {
         
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
           
              
        }
        

        @Override
        public void mouseExited(MouseEvent me) {
            
            
        }
    }
        private class ButtonWatcher implements ActionListener 
  {

                public void actionPerformed(ActionEvent e) 
                {
                Object buttonpressed = e.getSource();
                if (buttonpressed.equals(jButton1)){
                String UN = jTextField1.getText();
                              
                String type =jComboBox1.getSelectedItem().toString();
               ArrayList<AccountInfo> choosen1= new ArrayList<AccountInfo>(3);
               if(type.equals("CustomerAgent"))
                        choosen1=CustomerAgentList;
                    else if(type.equals("Teller"))
                        choosen1=Teller;
                    else if(type.equals("Manager"))
                        choosen1=Manager;
                    else if(type.equals("LoanOfficer"))
                        choosen1=LoanOfficer;
                    else if(type.equals("Customer"))
                        choosen1=CustomerList;
               for (AccountInfo HashMapItem : choosen1){
               hm.put(HashMapItem.getUserName(), HashMapItem.getPassword());
               }
                for (AccountInfo searchitem : choosen1){
  try{
                if (searchitem.getUserName().equals(UN)){
                   char hashpw[]= hm.get(UN);
                   
                    
                   char loginformpw[]=jPasswordField1.getPassword();
                
                if((hashpw.length < loginformpw.length) || (hashpw.length >loginformpw.length) ){
                JOptionPane.showMessageDialog(null, "Invalid User Name or Password or type");
                
                }
                else{  
                    int found=0;
                    for(int i=0;i<hashpw.length ;i++){
                 if(hashpw[i]==loginformpw[i]) {
                    found++;
                     
                 }          
                  } 
                  if(found==hashpw.length){
                  
                  JOptionPane.showMessageDialog(null, "Welcome "+UN);
                  if(type.equals("CustomerAgent")){
                  csa.setVisible(true);
                      setVisible(false);}
                    else if(type.equals("Teller")){
                  Tf.setVisible(true);
                      setVisible(false);}
                    else if(type.equals("Manager")){
                  mF.setVisible(true);
                      setVisible(false);}
                       
                    else if(type.equals("LoanOfficer")){
                  Lof.setVisible(true);
                      setVisible(false);}
                        
                    else if(type.equals("Customer"))
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                  }  else{
                      JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
                  }
                
                 
                }}
                else{
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
                        }}
            
                    
              catch (Exception r){
                JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
                }  }}
                else if(buttonpressed.equals(jButton2)){
                
              SignUpForm SUF= new SignUpForm();
              SUF.setVisible(true);
                    setVisible(false);
                }
                }

       
                }
                
                }
                  
                
