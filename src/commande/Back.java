package commande;

import ihm.Fenetre;

import java.io.IOException;

/**
 * Classe de la comande Back on done au curseur les valeurs que l'on sauvegarder
 * avec Remember
 * 
 * 
 */
public class Back implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory)
			throws IOException {
		/*
		 * On donne au curseur les valeurs que l'on a s
		 */
		Fenetre.jPanelDessin.curseur.setAbscisse(Fenetre.jPanelDessin.curseur
				.getRememberAbscisse());
		Fenetre.jPanelDessin.curseur.setOrdonnee(Fenetre.jPanelDessin.curseur
				.getRememberOrdonnee());
		Fenetre.jPanelDessin.curseur.setDirection(Fenetre.jPanelDessin.curseur
				.getRememberDirection());
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
	 * Vérifie si la commande n'a aucun argument
	 * 
	 * ici la longueur du tableau doit etre 1
	 * 
	 * @return true
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		if (parametres.length > 2) {
			/**
			 * Affiche un message d'erreur
			 * 
			 * @return false
			 */
			Fenetre.jTextAreaHistory
					.addError("Cette commande ne peut prendre aucun parametres");
			return false;
		}
		return true;
	}

	@Override
	/**
	 * la fonction random ne peut pas etre utilisé avec @see commande.Commande#random
	 */
	public int random() {
		// TODO Auto-generated method stub
		return 0;
	}

}
