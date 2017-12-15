/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;


import java.awt.*;
import java.io.Serializable;
import javax.swing.*;
import javax.swing.text.StyleConstants;
/**
 *
 * @author seifelmosalamy
 */
public class ManagerForm extends JFrame implements Serializable{
    
     public ManagerForm() {
          setSize(800,400);
       setTitle("Manager");
        setLayout(null);
        initComponents();
    }
     private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JTextField jTextField1;
     private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jComboBox1 = new JComboBox<>();
        jTextField1 = new JTextField();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1000,500);
        jPanel1.setBackground(new Color(20, 100, 190));

        jLabel1.setBounds(10,20,100,25);
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Transactions");

        jRadioButton1.setBounds(430,20,100,25);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Appprove");

        jRadioButton2.setBounds(580,20,100,25);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Disapprove");

        jLabel2.setBounds(10,160,100,25);
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Delete Employe");

        jButton1.setBounds(580,160,100,25);
        jButton1.setText("Delete");

        jButton2.setBounds(600,300,80,25);
        jButton2.setText("OK");

        jComboBox1.setBounds(200,20,130,25);
        jComboBox1.addItem("Item 1");
        jComboBox1.addItem("Item 2");
        jComboBox1.addItem("Item 3");
        jComboBox1.addItem("Item 4");
        

        jTextField1.setBounds(200,160,130,25);
        jTextField1.setText("Enter Employe name");

        jButton3.setBounds(430,160,100,25);
        jButton3.setText("Search");
             add(jPanel1);
             jPanel1.add(jButton1);
             jPanel1.add(jButton2);
             jPanel1.add(jButton3);
             jPanel1.add(jLabel1);
             jPanel1.add(jLabel2);
             jPanel1.add(jComboBox1); 
             jPanel1.add(jRadioButton1); 
             jPanel1.add(jRadioButton2);
             jPanel1.add(jTextField1); 
            
     }
}