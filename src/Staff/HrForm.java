package Staff;

import java.awt.*;
import java.io.Serializable;
import javax.swing.*;

/**
 *
 * @author seifelmosalamy
 */
public class HrForm extends JFrame implements Serializable{
    public HrForm() {
       setSize(800,400);
       setTitle("HR");
        setLayout(null);    
       initComponents();
    }
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    
   private void initComponents() {
       
      
       
        
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jComboBox1 = new JComboBox<String>();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField3 = new JTextField();
        jButton1 = new JButton();
        jLabel5 = new JLabel();
        jButton2 = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1000,500);
        jPanel1.setBackground(new Color(20, 100, 190));

        jLabel1.setBounds(10,20,100,25);
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setText("Set Salary ");

        jComboBox1.setBounds(270,20,110,25);
        jComboBox1.addItem("Teller");
        jComboBox1.addItem("LoansOfficer");
        jComboBox1.addItem("CustomerServiceAgent");
        
        jLabel2.setBounds(160,20,100,25);
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setText("Staff");

        jTextField2.setBounds(270,70,110,25);
        jTextField2.setText("Employe Name");

        jLabel3.setBounds(160,70,100,25);
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setBounds(160,130,100,25);
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Salary");

        jTextField3.setBounds(270,130,110,25);
        jTextField3.setText("Enter the amount");

        jButton1.setBounds(500,300,110,25);
        jButton1.setText("OK");

        jLabel5.setBounds(10,200,100,25);
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Register Employe");

        jButton2.setBounds(270,200,110,25);
        jButton2.setText("SignUp");
        
             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);
             jPanel1.add(jComboBox1);
             jPanel1.add(jLabel1);
             jPanel1.add(jLabel2);
             jPanel1.add(jLabel3);
             jPanel1.add(jLabel4);
             jPanel1.add(jLabel5);                                                
             jPanel1.add(jTextField2);
             jPanel1.add(jTextField3); 
   }
            
    
    
    
}