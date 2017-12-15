package bankingsystemfinal; 
import java.io.Serializable;
public class AccountInfo  implements Serializable 
{ 

       
  

    private int Type ; 

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public String getSecurityAnswer() {
        return SecurityAnswer;
    }

    public void setSecurityAnswer(String SecurityAnswer) {
        this.SecurityAnswer = SecurityAnswer;
    }
   
    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName)  {
        this.UserName = UserName;
    }
    private String Fname;

    private String Lname;

    private String Email;

    private char[] Password;
    public int l;
    private int Key;

    private String SecurityQuestion;
    
    private int MobileNumber;
    
    private String SecurityAnswer ; 
    
    private String Gender ; 

    private int Age;
    
    private int BankAmount=0;
    private int NumberOfTransactions = 0;
    private String AccountCurrencyType;

    public String getAccountCurrencyType() {
        return AccountCurrencyType;
    }

    public void setAccountCurrencyType(String AccountCurrencyType) {
        this.AccountCurrencyType = AccountCurrencyType;
    }

    public int getNumberOfTransactions() {
        return NumberOfTransactions;
    }

    public void setNumberOfTransactions(int NumberOfTransactions) {
        this.NumberOfTransactions = NumberOfTransactions;
    }

    public int getBankAmount() {
        return BankAmount;
    }

    public void setBankAmount(int BankAmount) {
        this.BankAmount = BankAmount;
    }

    public AccountInfo() {
        
            
    }
 
   
         
    

    public void UniqueKeyGeneration() {
    }

  
   

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char[] getPassword() {
        return Password;
    }

    public void setPassword(char Password[]) {
        this.Password = Password;
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }

    public String getSecurityQuestion() {
        return SecurityQuestion;
    }

    public void setSecurityQuestion(String SecurityQuestion) {
        this.SecurityQuestion = SecurityQuestion;
    }

    public int getMobileNumber() {
        
        return MobileNumber;
    }

    public void setMobileNumber(int MobileNumber) {
        
  
        
        this.MobileNumber = MobileNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        
        if ( age >=18  && age <=70)
        this.Age = age;
        else 
            Age = 0 ; 
        }
    

  
}
    
    
  