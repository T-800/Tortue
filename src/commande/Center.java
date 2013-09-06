package commande;

import ihm.Fenetre;

import java.io.IOException;

/**
 * Place le curseur au centre de l'image
 */
public class Center implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory)
			throws IOException {
		// TODO Auto-generated method stub
		Fenetre.jPanelDessin.curseur.setAbscisse(Fenetre.jPanelDessin
				.getWidth() / 2);
		Fenetre.jPanelDessin.curseur.setOrdonnee(Fenetre.jPanelDessin
				.getHeight() / 2);
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
	 * V�rifie que la commande n'a aucun parametre
	 * donc la taille du tableau doit etre �gal � 1
	 * 
	 * @return true
	 *
	 * (non-Javadoc)
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		if (parametres.length > 2) {
			/**
			 * @return false Envoi un message d'erreur si la commande prend au
			 *         moins un argument
			 */
			Fenetre.jTextAreaHistory
					.addError("Cette commande ne prend aucun argument");
			return false;
		}
		/**
		 * @return true Si la commande est correct
		 */
		return true;
	}

	@Override
	public int random() {
		// TODO Auto-generated method stub
		return 0;
	}

}
