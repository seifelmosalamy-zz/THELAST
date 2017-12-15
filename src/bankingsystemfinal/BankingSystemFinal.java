/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;



import Staff.CustomerServiceAgentForm;
import Staff.HrForm;
import Staff.ManagerForm;
import Staff.Teller;
import Staff.TellerForm;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *.
 * @author seifelmosalamy
 */
public class BankingSystemFinal implements Serializable{
    
    /**
     * @throws java.io.FileNotFoundException
     * 
     */  public static HashMap<String,char[]> hm=new HashMap<String,char[]>();
          public static   Rectangle labelbounds = new Rectangle(0,0,100,50);
    public static Rectangle textfieldbounds = new Rectangle(0,0,200, 30);
     public static ArrayList<AccountInfo> x = new ArrayList< AccountInfo>();
  public static ArrayList<AccountInfo> list1= new ArrayList<AccountInfo>(3);
  public static ArrayList<LoansApplicationForm> LoansApplicationList= new ArrayList<LoansApplicationForm>(3);
  public static ArrayList<AccountInfo> CustomerAgentList= new ArrayList<AccountInfo>(3);
   public static ArrayList<AccountInfo> HrList = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> Teller = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> CustomerServiceAgent = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> Manager = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> LoanOfficer = new ArrayList< AccountInfo>();
   public static     LoansApplicationForm ob = new LoansApplicationForm();
   public static AccountInfo a = new AccountInfo();
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
    //ReadFile R= new ReadFile();R.ReadFromFile(); to read from file 
        

        SmartWalletForm smf = new SmartWalletForm();
        smf.setVisible(true);
        ReportsForm rf = new ReportsForm();
        rf.setVisible(true);
        StaffForm sf = new StaffForm();
        sf.setVisible(true);
        ManagerForm m = new ManagerForm();
        m.setVisible(true);
        HrForm hr = new HrForm();
        hr.setVisible(true);
        TellerForm tl = new TellerForm();
        tl.setVisible(true);
        LoansApplicationForm laf = new LoansApplicationForm();
        laf.setVisible(true);
        CustomerServiceAgentForm csaf = new CustomerServiceAgentForm();
        csaf.setVisible(true);
        SignUpForm suf = new SignUpForm("Sign up");
        suf.setVisible(true);
        TransactionsForm transaction = new TransactionsForm ();
        LoginForm loginf = new LoginForm();
        loginf.setVisible(true);
            
          
    }}
    

