package commande;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Erase implements Commande {
	
	//Elle efface d'un nombre de pixel données l trait qu'on a fait
	public static void execute(SymboleQuiDessine s, int n){
		for (int i=n; i>0; i--){
			
		}
	}

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}
}
