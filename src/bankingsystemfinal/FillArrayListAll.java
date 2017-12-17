/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import static bankingsystemfinal.BankingSystemFinal.AllLists;
import static bankingsystemfinal.BankingSystemFinal.CustomerList;
import java.util.ArrayList;

/**
 *
 * @author Mohamed
 */
public class FillArrayListAll {
    
        public void fillarray (ArrayList<AccountInfo>list)
        {
             for (int i =0 ; i <list.size(); i ++ )
            AllLists.add(list.get(i));
            
        }
    
}
