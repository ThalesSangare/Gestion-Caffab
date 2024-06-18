/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPDAO;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Meeriame
 */
public class IMP_JTABLE {
    public static void IMP_Jtable(JTable jt, String titre){
        MessageFormat entete = new MessageFormat(titre);
        MessageFormat pied = new MessageFormat("Page{0,number,integer}");
        try {
            jt.print(JTable.PrintMode.FIT_WIDTH,entete,pied);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erreur d'imprime Jtable");
        }
    }
    
}
