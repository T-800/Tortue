package commande;

import ihm.Fenetre;
import java.io.IOException;

/**
 * Dirige le curseur vers la droite, un angle de 0�
 */

public class Right implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * 
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory)
			throws IOException {
		Fenetre.jPanelDessin.curseur.setDirection(0);
		if (addToHistory)
			history.addToHistory(ToString(parametres));

	}

	@Override
	/**
	 * (non-Javadoc)
	 * 
	 * @see commande.Commande#ToString(java.lang.String[])
	 */
	public String ToString(String[] tab) {
		String s = "";

		for (int i = 0; i < tab.length; i++) {
			s += tab[i] + " ";
		}
		return s;
	}

	@Override
	/**
	 * V�rfie que la commande n'a aucun argument
	 * 
	 * @return true
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		// TODO Auto-generated method stub
		/*
		 * Si la commande a au moins un arguemnt alors elle envoie un message
		 * d'erreur
		 * 
		 * @return false
		 */
		if (parametres.length > 2) {
			Fenetre.jTextAreaHistory
					.addError("Cette commande ne prend aucun parametre");
			return false;
		}
		return true;
	}

	@Override
	public int random() {
		// TODO Auto-generated method stub
		return 0;
	}
}