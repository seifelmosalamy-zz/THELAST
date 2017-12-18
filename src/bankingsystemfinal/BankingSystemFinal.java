/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;



import Staff.CustomerForm;
import Staff.CustomerServiceAgentForm;
import Staff.HrForm;
import Staff.ManagerForm;
import Staff.TellerForm;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Graphics;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jsoup.Jsoup;
/**
 *.
 * @author seifelmosalamy
 */
public class BankingSystemFinal implements Serializable {
    public static int ctrm,ctrf,ctrt,ctrmw,ctrfw,ctrtw,ctrtt,ctrfc,ctrmc,ctrtc;
    public static ArrayList<JLabel>arraylistoflabels = new ArrayList<JLabel>();
    public static Font font = new Font("Gadugi", Font.BOLD, 12);
    public static HashMap<String,char[]> hm=new HashMap<String,char[]>();
          public static   Rectangle labelbounds = new Rectangle(0,0,100,50);
    public static Rectangle textfieldbounds = new Rectangle(0,0,200, 30);
    public static ArrayList<AccountInfo> CustomerList , CustomerAgentList , HrList ,Teller ,Manager, LoanOfficer ,x  
    = new ArrayList<AccountInfo>(3);
  public static ArrayList<LoansApplicationForm> LoansApplicationList= new ArrayList<LoansApplicationForm>(3);
   public static     LoansApplicationForm ob = new LoansApplicationForm();
    public static ArrayList<String> Scrabbinglist = new ArrayList<String>();
  public static AccountInfo a = new AccountInfo();
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
    //ReadFile R= new ReadFile();R.ReadFromFile(); to read from file 

       ReadFromFile rff= new ReadFromFile();

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

        CurrencyScrabbing c = new CurrencyScrabbing()  ;
        CustomerForm cf2 =new CustomerForm();
     
        Sound sound = new Sound();
        //sound.play();
        Reports r = new Reports ();
        GraphicsClass graphics = new GraphicsClass();
        JFrame jf = new JFrame();
        JFrame jf2 = new JFrame();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setSize(1000,1000);
        jf.setTitle("Painting Statistics");
        jf.add(graphics);
        PaintingForWorkers pfw=new PaintingForWorkers();
     
        
        jf.setVisible(true);
        jf2.setSize(1000,1000);
        jf2.setTitle("Painting Statistics");
        jf2.add(pfw);
        jf2.setVisible(true);
        
       
        
    }


}

    
