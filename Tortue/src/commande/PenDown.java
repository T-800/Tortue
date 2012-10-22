package commande;


import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;

public class PenDown implements Commande {
	
	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		curseur.setPendown(true);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}
}
