package commande;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;

public class PenUp implements Commande {
	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		curseur.setPendown(false);
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}
}
