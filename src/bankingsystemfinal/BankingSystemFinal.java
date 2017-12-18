/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;



import Staff.CustomerServiceAgentForm;
import Staff.HrForm;
import Staff.ManagerForm;
import Staff.TellerForm;

import java.awt.Font;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.util.HashMap;
import javax.swing.JLabel;

import org.jsoup.Jsoup;
/**
 *.
 * @author seifelmosalamy
 */
public class BankingSystemFinal implements Serializable {
    public static ArrayList<JLabel>arraylistoflabels = new ArrayList<JLabel>();
    public static Font font = new Font("Gadugi", Font.BOLD, 12);
    public static HashMap<String,char[]> hm=new HashMap<String,char[]>();
          public static   Rectangle labelbounds = new Rectangle(0,0,100,50);
    public static Rectangle textfieldbounds = new Rectangle(0,0,200, 30);
     public static ArrayList<AccountInfo> x = new ArrayList< AccountInfo>();
  public static ArrayList<AccountInfo> list1= new ArrayList<AccountInfo>(3);
  public static ArrayList<LoansApplicationForm> LoansApplicationList= new ArrayList<LoansApplicationForm>(3);
  public static ArrayList<AccountInfo> CustomerAgentList= new ArrayList<AccountInfo>(3);
   public static ArrayList<AccountInfo> HrList = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> Teller = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> Manager = new ArrayList< AccountInfo>();
   public static ArrayList<AccountInfo> LoanOfficer = new ArrayList< AccountInfo>();
   public static     LoansApplicationForm ob = new LoansApplicationForm();
    public static ArrayList<String> Scrabbinglist = new ArrayList<String>();

   public static AccountInfo a = new AccountInfo();
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
    //ReadFile R= new ReadFile();R.ReadFromFile(); to read from file 


    
        ReadFromFile ReadAllFiles = new ReadFromFile();
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
        SignUpForm suf = new SignUpForm();
        suf.setVisible(true);
        TransactionsForm transaction = new TransactionsForm ();
        LoginForm loginf = new LoginForm();
        loginf.setVisible(true);
        TransactionsForm tf = new TransactionsForm();
        tf.setVisible(true);   
        CurrencyScrabbing cs  = new CurrencyScrabbing();
          //PlayMusic music = new PlayMusic();
    }}
    
