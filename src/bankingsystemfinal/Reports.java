package bankingsystemfinal;

import Staff.SearchReports;
import static bankingsystemfinal.BankingSystemFinal.AllLists;
import static bankingsystemfinal.BankingSystemFinal.LoansApplicationList;
import bankingsystemfinal.Interfaces.IReport;
import java.io.Serializable;
import java.util.ArrayList;

public class Reports extends SearchReports implements IReport , Serializable {

    public void GenderReport() { 
        //calculate Female and male then we can add them
        int ctrm,ctrf,ctrt;
        
        ctrf= SearchForReports("Female",AllLists);
        ctrm=SearchForReports("Male",AllLists);
        ctrt=ctrf+ctrm;
       
//Female+Male
    //lw 3aiz a7seb el gender fi ba2y el arraylist use Search() method
    }
    public void TransactionsReport() {
    }

    public void ProductsReport() {
    }

    public void LoansReport() {
        LoansApplicationList.size();
    }

    public void EmployeeReport() {
        
    }
public int SearchForReports(String currItem, ArrayList<AccountInfo> anylist){
        
        int ctr=0;        
        for(AccountInfo i:AllLists)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
    return ctr;
        }
 
}
