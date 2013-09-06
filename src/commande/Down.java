package commande;

import ihm.Fenetre;

import java.io.IOException;

/**
 * Place le curseur dans la direction du bas, un angle de 270
 */
public class Down implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory)
			throws IOException {
		Fenetre.jPanelDessin.curseur.setDirection(270);
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
	 * V�rifie qu'il n'y a aucun argument � la commande
	 * @return true
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		// TODO Auto-generated method stub
		if (parametres.length > 2) {
			/**
			 * @return false si la commande a un argument et affiche un message
			 *         d'erreur
			 */
			Fenetre.jTextAreaHistory
					.addError("Cette commande ne prend aucun argument");
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
