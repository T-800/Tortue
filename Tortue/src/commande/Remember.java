package commande;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;

public class Remember implements Commande {

	//Sauvegarde la derniere position

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		curseur.setActuabscisse(curseur.getAbscisse());
		curseur.setActuordonnee(curseur.getOrdonnee());
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}
}
