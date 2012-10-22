package commande;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Pensize implements Commande {

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		Object[] o;
		o=convertTo(parametres); 
		//curseur.setPensize((int)o[1]);
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		Integer i=Integer.parseInt(parametres[1]);
		return null;
	}
}
