/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;



import Staff.HrForm;
<<<<<<< HEAD
import Staff.ManagerForm;
import Staff.Teller;
import Staff.TellerForm;
import java.awt.FlowLayout;
import java.awt.Font;
=======
>>>>>>> 98b0ea4c0a2585021707f1351b112f8860282a03
import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.util.HashMap;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

        import java.io.*;
import javax.sound.sampled.*;
/**
 *.
 * @author seifelmosalamy
 */
public class BankingSystemFinal implements Serializable{
    
    /**
     * @throws java.io.FileNotFoundException
     * 
     */
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
   public static AccountInfo a = new AccountInfo();
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
    //ReadFile R= new ReadFile();R.ReadFromFile(); to read from file 


    
       try{
         ObjectInputStream inp = new ObjectInputStream(new FileInputStream("Customer.txt"));
         list1=null;
         list1= (ArrayList< AccountInfo>)inp.readObject();
         inp.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp2 = new ObjectInputStream(new FileInputStream("CustomerAgent.txt"));
         CustomerAgentList= (ArrayList< AccountInfo>)inp2.readObject();
         inp2.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp3 = new ObjectInputStream(new FileInputStream("Teller.txt"));
         Teller= (ArrayList< AccountInfo>)inp3.readObject();
         inp3.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp4 = new ObjectInputStream(new FileInputStream("Manager.txt"));
         Manager= (ArrayList< AccountInfo>)inp4.readObject();
         inp4.close();
        }catch(Exception c){
            
            }
try{
         ObjectInputStream inp5 = new ObjectInputStream(new FileInputStream("LoanOfficer.txt"));
         LoanOfficer= (ArrayList< AccountInfo>)inp5.readObject();
         inp5.close();
        }catch(Exception c){
            
            }
        SmartWalletForm smf = new SmartWalletForm();
        smf.setVisible(true);
        ReportsForm rf = new ReportsForm();
        rf.setVisible(true);
        StaffForm sf = new StaffForm();
        sf.setVisible(true);
       // ManagerForm m = new ManagerForm();
       // m.setVisible(true);
        HrForm hr = new HrForm();
        hr.setVisible(true);
       // TellerForm tl = new TellerForm();
       // tl.setVisible(true);
        LoansApplicationForm laf = new LoansApplicationForm();
        laf.setVisible(true);
        //CustomerServiceAgentForm csaf = new CustomerServiceAgentForm();
       // csaf.setVisible(true);
        //SignUpForm suf = new SignUpForm();
      //  suf.setVisible(true);
        TransactionsForm transaction = new TransactionsForm ();
        LoginForm loginf = new LoginForm();
        loginf.setVisible(true);
        TransactionsForm tf = new TransactionsForm();
        tf.setVisible(true);
            Thread thread= new Thread(laf);
            thread.start();
          //PlayMusic music = new PlayMusic();
    }}
    
