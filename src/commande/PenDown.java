package commande;

import ihm.Fenetre;

/*
 * Permet de dessiner sur le dessin
 */
public class PenDown implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * 
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory) {
		Fenetre.jPanelDessin.curseur.setPendown(true);
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
	 * 
	 * V�rifie que la commande n'a aucun parametre
	 * 
	 * @return true
	 * 
	 * (non-Javadoc)
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		// TODO Auto-generated method stub
		if (parametres.length > 2) {
			/*
			 * @return false Si la commande a au moins un argument Envoi un
			 * message d'erreur
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
