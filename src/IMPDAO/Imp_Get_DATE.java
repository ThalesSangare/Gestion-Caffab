/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPDAO;

import java.text.SimpleDateFormat;

/**
 *
 * @author Meeriame
 */
public class Imp_Get_DATE {
      public String get_date_systeme(){
        String retour_date = "";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        retour_date=format.format(new java.util.Date());;
        return retour_date;
    }
    
}
