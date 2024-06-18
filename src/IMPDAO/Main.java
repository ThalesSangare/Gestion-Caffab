
package IMPDAO;
import DAO.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Thales
 */
public class Main {

     public static void main(String[] args) {
//         int id_apprenant=new IMP_Apprenants().Get_id_apprenants_selon_tel("334");
//         System.out.println(id_apprenant);
         
         int t=new IMP_Inscription().get_id_inscrip_selon_telephone("334");
         System.out.println(t);
         
//         int k=new IMP_Inscription().get_id_inscrip_selon_matri_et_cours("A001", "MS WORD");
//         System.out.println(k);
         
//         if(new IMP_Inscription().ModificationApprenant("A001", "MS WORD", "MS EXCEL", "INSCRIPTION", "INCRIPTION") != 1062){
//             JOptionPane.showMessageDialog(null, "Modification effectuée");
//         }
//         else{
//             JOptionPane.showMessageDialog(null, "Modification echouée");
//         }
         
//         if(new IMP_Inscription().InscriptionApprenant("A001", "MS EXCEL", "MS WORD", "Reinscription", "Reinscription")){
//             JOptionPane.showMessageDialog(null, "Inscription effectuée");
//         }
//         else{
//              JOptionPane.showMessageDialog(null, "Inscription echouée");
//         }
         
//        if(new IMP_Frais_inscription().Modifier_Frais_inscription(1500, "reinscription")){
//             JOptionPane.showMessageDialog(null, "Modification effectuée");
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Modification non effectuée");
//        }
         
//          if(new IMP_Frais_Cours().Modifier_frais_cours("MS EXCEL", 250000)){
//              JOptionPane.showMessageDialog(null, "Modification effectuée");
//          }
//          else{
//              JOptionPane.showMessageDialog(null, "Modification non effectuée");
//          }

//         int n=new IMP_Inscription().get_id_inscrip_selon_matri_et_cours("A001", "MS EXCEL");
//         System.out.println(n);
//         int moi=new IMP_Inscription().Verification_apprenant_inscrit("MILLIMONO", "MS EXCEL");
//         System.out.println(moi);
//          Apprenants appren = new Apprenants();
//        appren.setMatricule("008");
//        appren.setNom("Camara");
//        appren.setPrenom("Djbril Singuila");
//        appren.setGenre("MASCULIN");
//        appren.setTel("620317898");
//        appren.setChemin_photo("src/images/book.png");
//        
//        int id_apprend= new IMP_Apprenants().Insertion_Apprenants(appren);
//         if(id_apprend!=0){
//            JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succès");
//        }
//        else{
//             JOptionPane.showMessageDialog(null,"Enregistrement echouer");
//        }
//         
//         
//         boolean bol=new IMP_Cours().verifi_matricule("dd");
//         if(bol){
//             JOptionPane.showMessageDialog(null, "Cours existe deja");
//             boolean bol=new IMP_Inscription().InscriptionApprenant("002","word","word","Reinscription","Reinscription","12/03/2023");
//         }
         
//         System.out.println("le montant est :" + new IMP_Inscription().Net_a_payer("INSCRIPTION", "word"));
//         System.out.println("le montant est :" + new IMP_Frais_inscription().get_montant_inscrip("INSCRIPTION", 1));
         
//         System.out.println("le type est :" + new IMP_Frais_inscription().get_type_inscrip(1));
         
//         System.out.println("l'id est : "+new IMP_Frais_inscription().get_id_frais_inscrip("REINSCRIPTION"));
         
//         boolean bol=new IMP_Inscription().InscriptionApprenant("002", "Word", "Word","INSCRIPTION");
         
         
//         System.out.println("l'id est :" + new IMP_Apprenants().Get_id_apprenants("002"));
//         System.out.println("l'id est :" + new IMP_Frais_Cours().Get_id_frais_cours("Word"));
//         System.out.println("l'id est :" + new IMP_Cours().Get_id_cours_selon_nom_cours("word"));
//         int retourr= new IMP_Frais_Cours().Enregistrer_frais_cours("120000","Excel");
//         if(retourr==1062){
//             JOptionPane.showMessageDialog(null, "Cet cours a deja un frais !");
//         }
//         else{
//             JOptionPane.showMessageDialog(null, "Frais enregistrer avec succès !");
//         }
//         
//         boolean bol=new IMP_Frais_inscription().Modifier_Frais_inscription("20000");
//         if(bol){
//             JOptionPane.showMessageDialog(null, "Frais d'inscription modifié avec succès");
//         }
//         else{
//             JOptionPane.showMessageDialog(null, "Frais d'inscription non modifié !");
//         }
         
         //================ APPRENANTS ======================================================
         //===INSERTION 
//         Apprenants appren= new Apprenants();
//         appren.setMatricule("002");
//         appren.setNom("Camara");
//         appren.setPrenom("Singuila");
//         appren.setGenre("Masculin");
//         appren.setTel("620317898");
//         System.out.println("voici l'erreur :"+new Implements().Insertion(appren));
//         if(new Implements().Insertion(appren) == 1062){
//             JOptionPane.showMessageDialog(null, "L'eleve exite deja !");
//         }
//         else{
//             JOptionPane.showMessageDialog(null,appren.getPrenom()+ " est ajouté avec succès");
//         }
//         
//         
//         // ====== AFFICHAGE
//            new Implements().AfficherToutLesApprenants();
//            
//         //===RECHERCHER
//            String retour = new Implements().RechercherApprenant("0032");
//            if(!retour.equalsIgnoreCase("")){
//                System.out.println(retour);
//            }
//            else{
//                System.out.println("L'Elève n'existe pas");
//            }
//            
//            //===MODIFICATION
//            boolean bol=new Implements().ModifationApprenant("003", "Sangare", "Thales", "Masculin", "1234");
//            if(bol){
//                JOptionPane.showMessageDialog(null,"Modifier avec succès");
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "modification non effectué");
//            }
//         
        //================ FIN APPRENANTS ====================================================== 
        
              //================ COURS =============================================================
//    //=== AJOUT DES COURS
//        Cours cour = new Cours();
//        cour.setLibelCours("merde");
//        // System.out.println("voici l'erreur :"+new Implements().AjouterCours(cour));
//        boolean bol= new IMP_Cours().AjouterCours(cour);
//         if(bol){
//             JOptionPane.showMessageDialog(null,"Cours ajouter avec succès!");
//         }
//         else{
//             JOptionPane.showMessageDialog(null,"non enreg");
//         }
//=== MODIFIER DES COURS
//            boolean boll = new Implements().ModifierCOURS(5, "MS");
//            if(boll){
//                JOptionPane.showMessageDialog(null,"Modifier avec succès");
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "modification non effectué");
//            }
////=== SUPPRIMER DES COURS
//            boolean sup = new Implements().SupprimerCours("MS");
//            if(sup){
//                JOptionPane.showMessageDialog(null,"supprimer avec succès");
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "suppression non effectué");
//            }
////=== AFFICHER DES COURS
//            new Implements().AfficherCours();
//
////=== RECERCHER UN COURS  
//            String retourr= new Implements().RechercheCours("tap");
//            if(!retourr.equalsIgnoreCase("")){
//                System.out.println(retourr);
//            }
//            else{
//                System.out.println("Cours introuvable");
//            }     
//======================= FIN COURS =============================================================
       
//        Inscription inscrip = new Inscription();
//        inscrip.setMontantFraisIns("1234");
//         System.out.println("voici l'erreur :"+new Implements().AjouterfraisInscrip(inscrip));
//         if(new Implements().AjouterfraisInscrip(inscrip) == 1062){
//             JOptionPane.showMessageDialog(null,"Le Frais existe deja !");
//         }
//         else{
//             JOptionPane.showMessageDialog(null,"Frais ajouter avec succès");
//         }
         
     }
        
}
