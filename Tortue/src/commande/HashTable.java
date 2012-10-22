package commande;

import history.HistoryTortue;

import java.io.IOException;
import java.util.Hashtable;

import javax.naming.CommunicationException;
import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;

/**
 * Cette classe fait le lien entre l'interpreteur de commande et les differentes fonctions possible
 * @author Renaud
 *
 */
public class HashTable {
	
	Hashtable<String, Commande> hashCommande = new Hashtable<String, Commande>();

	
	/**
	 * déclaration de la table de hashage 
	 */
    public HashTable() {
    	
		hashCommande.put("BACK", new Back());
		hashCommande.put("BACKGROUNDCOLOR", new BackgroundColor());
		hashCommande.put("CENTER", new Center());
		hashCommande.put("CIRCLE", new Circle());
		hashCommande.put("CLEAR", new Clear());
		hashCommande.put("DOWN", new Down());
		hashCommande.put("ERASE", new Erase());
		hashCommande.put("HELP", new Help());
		hashCommande.put("LEFT", new Left());
		hashCommande.put("MOVE", new Move());
		hashCommande.put("NEW", new New());
		hashCommande.put("OPEN", new Open());
		hashCommande.put("PENCOLOR", new PenColor());
		hashCommande.put("PENDOWN", new PenDown());
		hashCommande.put("PENSIZE", new Pensize());
		hashCommande.put("PENUP", new PenUp());
		hashCommande.put("REDO", new Redo());
		hashCommande.put("REMEMBER", new Remember());
		hashCommande.put("REPEAT", new Repeat());
		hashCommande.put("RIGHT", new Right());
		hashCommande.put("SAVE", new Save());
		hashCommande.put("TURN", new Turn());
		hashCommande.put("UNDO", new Undo());
		hashCommande.put("UP", new Up());
		
	}
    
    /**
     * cette fonction est appelée par le termial quand on presse ENTRER 
     * @param commande LE String de la commande plus les arguments
     * @param curseur le Curseur pour modifier ses info 
     * @param dessin pour pouvoir ajouter les modifications
     * @throws IOException 
     */
    //TODO : Trouver un nom pour cette fonction
    public void hgj(String commande, CurseurQuiDessine curseur, JPanel dessin) throws NullPointerException , IOException{
    	String [] c = decoupageSpace(commande);
    	hashCommande.get(c[0]).execute(c,dessin,curseur);
    	
    	
    }
    
    
    /**
     * La fonction decoupage la fonction et ses arguments dans un tableau de String 
     * @param commande
     * @return le Tableau de string avec le nom de la fonction en [0] et les argument apres s'il y en a
     * 
     */
    
    public String [] decoupage(String commande){
    	
    	String [] c = commande.split(";");
		
    	return c;
    	
    }
    
    public String [] decoupageSpace(String commande){
    	
    	String [] c = commande.split(" ");
		
    	return c;
    	
    }
    
    //TODO AJouter une fonction de decoupage qui decoupe avec ";" pour la commande repeat 
    

}
