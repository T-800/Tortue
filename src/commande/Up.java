package commande;

import ihm.Fenetre;
/*
 * Dirige le curseur vers le haut, un angle de 90�
 */
import java.io.IOException;

/**
 * FINI
 * 
 * @author slater
 * 
 */
public class Up implements Commande {

	@Override
	/**
	 * (non-Javadoc)
	 * 
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory)
			throws IOException {
		Fenetre.jPanelDessin.curseur.setDirection(90);
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
	 * V�rifie qu'il n'y a aucun argument
	 * 
	 * @return true
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		/*
		 * Si la commande prend au moins un argument, envoie un message d'erreur
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
