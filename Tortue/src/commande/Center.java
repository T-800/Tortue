package commande;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Center implements Commande {

	// Place le curseur au centre de l'image
	/*
	 * Trouver un moyen pour qu'on recupere la taille du panel  dessin 
	 * du dessin
	 *
	*/
	
	public static void execute(SymboleQuiDessine s){
		s.setAbscisse(0);
		s.setOrdonnee(0);
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
