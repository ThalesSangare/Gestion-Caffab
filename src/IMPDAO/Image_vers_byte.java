/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPDAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Image_vers_byte {
    
    public InputStream get_byte_image(String chemin){
        InputStream image=null;
        try {
            image=new FileInputStream(chemin);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erreur de conversion image "+ex.getLocalizedMessage());
        }
        return image;
    }
    
}
