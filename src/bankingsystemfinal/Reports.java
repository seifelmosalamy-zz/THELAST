package bankingsystemfinal;

import Staff.SearchReports;
import static bankingsystemfinal.BankingSystemFinal.LoansApplicationList;
import bankingsystemfinal.Interfaces.IReport;
import java.io.Serializable;
import java.util.ArrayList;

public class Reports extends SearchReports implements IReport , Serializable {

    public void GenderReport() { 
        //calculate Female and male then we can add them
        int ctrm,ctrf,ctrt;
        
        ctrf= SearchLoans("Female",LoansApplicationList);
        ctrm=SearchLoans("Male",LoansApplicationList);
    ctrt=ctrf+ctrm; //Female+Male
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
public int SearchLoans(String currItem, ArrayList<LoansApplicationForm> LoansApplicationList){
        
        int ctr=0;        
        for(LoansApplicationForm i:LoansApplicationList)
        {
        if(currItem.equals(i.getGender()))
        {
        ctr++;
        }
        }
    return ctr;
        }
 
}
