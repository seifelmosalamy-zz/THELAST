package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.LoansApplicationList;
import bankingsystemfinal.Interfaces.IReport;
import java.io.Serializable;

public class Reports implements IReport , Serializable {

    public void GenderReport() {
        String MaleSearch="Male";
        String FemaleSearch="Female";
        int ctrMale=0;
        int ctrFemale=0;
        System.out.println(LoansApplicationList.get(0).gender);
        for(LoansApplicationForm i:LoansApplicationList)
        {
        if(MaleSearch.equals(i.gender))
        {
        ctrMale++;
        System.out.println("Male:"+ctrMale);
        }
        if(FemaleSearch.equals(i.gender))
        {
        ctrFemale++;
        System.out.println("Female:"+ctrFemale);
    }
        }
    }
    public void TransactionsReport() {
    }

    public void ProductsReport() {
    }

    public void LoansReport() {
    }

    public void EmployeeReport() {
    }

 
}
