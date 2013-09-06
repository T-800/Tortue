package commande;

import ihm.Fenetre;

/**
 * L�ve le pinceau du dessin
 * donc il sera impossible de dessiner
 */
public class PenUp implements Commande {
	@Override
	public void execute(String[] parametres, boolean addToHistory) {
		// TODO Auto-generated method stub
		Fenetre.jPanelDessin.curseur.setPendown(false);
		if (addToHistory)
			history.addToHistory(ToString(parametres));

	}

	@Override
	public String ToString(String[] tab) {
		String s = "";

		for (int i = 0; i < tab.length; i++) {
			s += tab[i] + " ";
		}
		return s;
	}

	@Override
	/**
	 * (non-Javadoc) V�rfie que la commande n'a aucun parametre
	 * 
	 * @return true
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		// TODO Auto-generated method stub
		/*
		 * Si la commande a pris un argument
		 * 
		 * @return false Plus un message d'erreur
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
