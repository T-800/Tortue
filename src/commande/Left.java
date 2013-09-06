package commande;

import ihm.Fenetre;

import java.io.IOException;

/**
 * Place le curseur dans la direction de gauche, un angle de 180�
 */
public class Left implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory)
			throws IOException {
		Fenetre.jPanelDessin.curseur.setDirection(180);
		if (addToHistory)
			history.addToHistory(ToString(parametres));

	}

	@Override
	/**
	 * (non-Javadoc)
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
	 * 
	 * V�rfie que la commande n'a aucun argument
	 * @return true
	 * 
	 * (non-Javadoc)
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		if (parametres.length > 2) {
			/*
			 * @return false Si la commande a des arguments Envoi un message
			 *         d'erreur
			 */
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
