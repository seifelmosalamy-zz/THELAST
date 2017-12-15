/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;
import static bankingsystemfinal.BankingSystemFinal.a;
import static bankingsystemfinal.BankingSystemFinal.labelbounds;
import static bankingsystemfinal.BankingSystemFinal.list1;
import static bankingsystemfinal.BankingSystemFinal.textfieldbounds;
import static bankingsystemfinal.BankingSystemFinal.x;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static java.lang.System.exit;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;




/**
 *
 * @author seifelmosalamy
 */
public class SignUpForm extends JFrame   {
   private JTextField UserNameTextField;
    private JLabel UserNameLabel ; 
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JButton ReadButton;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel Jlabelname;
    private JButton SaveButton ;
    private JLabel PasswordLabel;
    private JPasswordField jPasswordField1;
   // private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;

        public SignUpForm(String s )  {
            super(s);
                //Panel
                 JPanel panel = new JPanel();
        setLayout(null);
        panel.setBounds(500, 0, 500, 500);
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(36, 45, 67));
        add(panel);
           //JFrame Properties
            
            setBackground(Color.white);
            //setLayout(new FlowLayout());
        //    setTitle("Sign Up");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
            setSize(1000,500);
            
      //Initializing variables 
      PasswordLabel = new JLabel("Password");
      UserNameTextField = new JTextField("Enter UserName");
        UserNameLabel = new JLabel("User Name");
        ReadButton = new JButton ("Read From File");
        Jlabelname = new JLabel();
        jButton3 = new JButton();
        jTextField1 = new JTextField("Enter your first name");
        jLabel1 = new JLabel("First Name");
        jLabel2 = new JLabel("Last Name");
        jTextField2 = new JTextField("Enter your last name");
        jLabel3 = new JLabel("Email");
        jLabel4 = new JLabel("Mobile Number");
        jLabel5 = new JLabel("Password");
        jLabel6 = new JLabel("Age");
        jTextField3 = new JTextField("Enter your email here");
        jTextField5 = new JTextField("Enter your mobile number");
        jTextField6 = new JTextField("Enter your age");
        jTextField7 = new JTextField();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton("Submit");
        jLabel10 = new JLabel();
        jLabel9 = new JLabel();
        jPasswordField1 = new JPasswordField();  
        jLabel13 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jButton2 = new JButton("Search for an employee");
        jButton4 = new JButton();
        jButton5 = new JButton();       
        jRadioButton2 = new JRadioButton();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        SaveButton = new JButton();
        jPasswordField1 = new JPasswordField("Enter Password");
          

  
            //Listners 
            
         jButton1.addActionListener(new ButtonWatcher());
         jButton2.addActionListener(new ButtonWatcher());
         SaveButton.addActionListener(new ButtonWatcher());
         ReadButton.addActionListener(new ButtonWatcher());
        //Setting Bounds 
        jPasswordField1.setBounds(textfieldbounds);
        UserNameLabel.setBounds(labelbounds);
        jButton1.setBounds(labelbounds);
        jTextField1.setBounds(textfieldbounds);
        jTextField2.setBounds(textfieldbounds);
        jTextField3.setBounds(textfieldbounds);
        jTextField5.setBounds(textfieldbounds);
        jTextField6.setBounds(textfieldbounds);
        jTextField7.setBounds(textfieldbounds);     
        jLabel1.setBounds(BankingSystemFinal.labelbounds);
        jLabel2.setBounds(labelbounds);
        jLabel3.setBounds(labelbounds);
        jLabel4.setBounds(labelbounds);
        jLabel5.setBounds(labelbounds);
        jLabel6.setBounds(labelbounds);
        jLabel7.setBounds(labelbounds);
        jLabel8.setBounds(labelbounds);
        jLabel9.setBounds(labelbounds);
        jLabel10.setBounds(labelbounds);
        Jlabelname.setBounds(labelbounds);
        SaveButton.setBounds(labelbounds);
        ReadButton.setBounds(labelbounds);;
        jLabel3.setBounds(labelbounds);
        jLabel14.setBounds(labelbounds);
        jLabel15.setBounds(labelbounds);
        UserNameTextField.setBounds(textfieldbounds);
        PasswordLabel.setBounds(labelbounds);
        
        //Colors
        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);
        jLabel3.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        jLabel6.setForeground(Color.white);
        UserNameLabel.setForeground(Color.white);
        SaveButton.setForeground(Color.black);
        SaveButton.setText("Save to file");
        PasswordLabel.setForeground(Color.white);
        
       //Adding to the form 
       
        panel.add(UserNameLabel);
        panel.add(UserNameTextField);
        panel.add(PasswordLabel);
        panel.add(jPasswordField1);
        panel.add(jLabel1);
        panel.add(jTextField1);
        panel.add(Jlabelname);
        panel.add(jLabel2);
        panel.add(jTextField2);
        panel.add(jLabel3);
        panel.add(jTextField3);
        panel.add(jLabel4);
        panel.add(jTextField5);
        panel.add(jLabel15);
        panel.add(jLabel6);
        panel.add(jTextField6);
        panel.add(jLabel10); 
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(SaveButton);
        panel.add(ReadButton);
        
      
        

         
  
      
            
        
    }
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;

  private class ButtonWatcher implements ActionListener 
  {

                public void actionPerformed(ActionEvent e) {
                    Object buttonpressed = e.getSource();

                    if (buttonpressed.equals(jButton1)){
                        String U = UserNameTextField.getText();
                        
                        a.setUserName(U);
                        String s = jTextField1.getText();
                        
                        char[] p = jPasswordField1.getPassword();
                        a.setPassword(p);
                     if(s.equals("Enter your first name") || s.equals(""))
                     {
                       Jlabelname.setText("Enter valid name");
                       Jlabelname.setForeground(Color.red);
                     }
                     else{
                               Jlabelname.setText("Valid");
                               Jlabelname.setForeground(Color.green);
                         a.setFname(s);
                     }
                 String lname = jTextField2.getText();
                         a.setLname(lname);

                 String email = jTextField3.getText();
            a.setEmail(email);
            char[] Password = jPasswordField1.getPassword();
            a.setPassword(Password);
            try {
            int mobilePhone = Integer.parseInt(jTextField5.getText());
              String sPhoneNumber = jTextField5.getText();

              Pattern pattern = Pattern.compile("\\d{11}");
              Matcher matcher = pattern.matcher(sPhoneNumber);

              if (matcher.matches()) {
                 a.setMobileNumber(mobilePhone);
                 jLabel15.setText("Valid");
                     jLabel15.setForeground(Color.green);
              }
              else {
                   jLabel15.setText("Incorrect phone number");
                  jLabel15.setForeground(Color.red);
              }
            int age ;
            age= Integer.parseInt(jTextField6.getText());
            a.setAge(age);

            if(a.getAge() == 0 )
            {
            String error="Enter Valid Age";
            jLabel10.setText(error);

            jLabel10.setForeground(Color.red);
            age= Integer.parseInt(jTextField6.getText());


                    }
                    else {
                            jLabel10.setText("Valid");
                        jLabel10.setForeground(Color.green);

                    }
            }catch(Exception exception)

            {
                JOptionPane jo = new JOptionPane();
                jo.showMessageDialog(null, " Enter age and mobile number");
            }

                    String Answer = jTextField7.getText();
                    a.setSecurityAnswer(Answer);

                        }

                else if (buttonpressed.equals(jButton2))
                {

                       DeleteEmployeeForm de = new DeleteEmployeeForm();
                       de.setTitle("Delete Form");
                       de.setVisible(true);
                }
                else if (buttonpressed.equals(SaveButton))
                {
                     try {
            list1.add(a);
            ObjectOutputStream ob= new ObjectOutputStream(new FileOutputStream("Employee.txt"));
            ob.writeObject(list1);
            ob.close();      
              } catch (IOException ex) {}
        
                }
                else if ( buttonpressed.equals(ReadButton))
                {
                      try{
         ObjectInputStream inp = new ObjectInputStream(new FileInputStream("Employee.txt"));
         x= (ArrayList< AccountInfo>)inp.readObject();
       System.out.print("read");
        }catch(Exception c){
            exit(0);
            }
    } 
                }
                }
                
  }


          
   
        
     
    
      

   
    


