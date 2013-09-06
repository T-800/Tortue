package commande;

import ihm.Fenetre;

import java.awt.Color;
import java.util.Random;

/**
 * Commande qui permet de choisir la couleur du fond du dessin
 * 
 */
public class BackgroundColor implements Commande {

	/**
	 * convertiCouleur converti le parametre entre en la couleur demandee et
	 * mettra la couleur de fond en la couleur voulu
	 * 
	 * converti les 13 couleurs de JAVA predefinies, et les valeurs
	 * hexadecimales
	 * 
	 * @param s
	 * @return color retourne la couleur voulu
	 */
	public Color convertiCouleur(String s) {
		if (s.equalsIgnoreCase("black") || s.equalsIgnoreCase("noir") || s.equals("#000000")) {
			return Color.black;
		}
		if (s.equalsIgnoreCase("blanc") || s.equalsIgnoreCase("white") || s.equals("#ffffff")) {
			return Color.white;
		}
		if (s.equalsIgnoreCase("blue") || s.equalsIgnoreCase("bleu") || s.equals("#0000ff")) {
			return Color.blue;
		}
		if (s.equalsIgnoreCase("cyan") || s.equals("#00ffff")) {
			return Color.cyan;
		}
		if (s.equalsIgnoreCase("jaune") || s.equalsIgnoreCase("yellow") || s.equals("#ffff00")) {
			return Color.yellow;
		}
		if (s.equalsIgnoreCase("red") || s.equalsIgnoreCase("rouge") || s.equals("#ff0000")) {
			return Color.red;
		}
		if (s.equalsIgnoreCase("rose") || s.equalsIgnoreCase("pink") || s.equals("#fd6c9e")) {
			return Color.pink;
		}
		if (s.equalsIgnoreCase("orange") || s.equalsIgnoreCase("#ed7f10")) {
			return Color.orange;
		}
		if (s.equalsIgnoreCase("magenta") || s.equals("#ff00ff")) {
			return Color.magenta;
		}
		if (s.equalsIgnoreCase("lightgray") || s.equalsIgnoreCase("gris clair")
				|| s.equals("#afafaf")) {
			return Color.lightGray;
		}
		if (s.equalsIgnoreCase("green") || s.equalsIgnoreCase("vert") || s.equals("#00ff00")) {
			return Color.green;
		}
		if (s.equalsIgnoreCase("gray") || s.equalsIgnoreCase("gris") || s.equals("#606060")) {
			return Color.gray;
		}
		if (s.equalsIgnoreCase("darkgray") || s.equalsIgnoreCase("grisfonce")
				|| s.equals("#463F32")) {
			return Color.darkGray;
		} 
		if (s.equalsIgnoreCase("random")) {
			Color c = new Color(random());
			return c;
		} else {
			try {
				Integer c = Integer.parseInt(s.replaceFirst("#", ""), 16);
				Color f = new Color(c.intValue());
				return (f);
			} catch (NumberFormatException e1) {
				return Color.white;
			}
		}
	}

	@Override
	/**
	 * (non-Javadoc)
	 * @see commande.Commande#execute(java.lang.String[], boolean)
	 */
	public void execute(String[] parametres, boolean addToHistory) {
		// TODO Auto-generated method stub
		if (addToHistory)
			history.addToHistory(ToString(parametres));
		Fenetre.jPanelDessin.curseur
				.setBackground(convertiCouleur(parametres[1]));
		Fenetre.jPanelDessin.setBackground(convertiCouleur(parametres[1]));

	}

	@Override
	/**
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
	 * Verifie que la parametre entre est correct
	 * 
	 * @param s
	 * 		recupere le parametre de couleur
	 * @return true
	 * 
	 * @see commande.Commande#canDoIt(java.lang.String[])
	 */
	public boolean canDoIt(String[] parametres) {
		// TODO Auto-generated method stub
		String s = parametres[1];
		if (s.equalsIgnoreCase("random")) {
			return true;
		}

		/**
		 * Verifie que le parametre entre est unique
		 * Donc la taille du tableau est de 2
		 * 
		 * @return false
		 */
		if (parametres.length < 2) {
			Fenetre.jTextAreaHistory
					.addError("Il manque un argument a votre commande");
			return false;
		} else if (parametres.length > 3) {
			Fenetre.jTextAreaHistory
					.addError("Cette commande ne prend qu'un seul argument");
			return false;
		}

		/**
		 * Verifie que si la parametre est un hexadecimal est bien de longueur 7
		 * avec le #
		 * 
		 * @return true
		 */
		else if (s.startsWith("#")) {
			if (s.substring(1).length() == 6) {
				if (s.matches("[a-fA-F_0-9]")) {
					return true;
				}
			}
		}

		/**
		 * Si le parametre entre est une chaine de caractere, elle verifie
		 * l'orthographe
		 * 
		 * @return true Si l'ortographe est correcte
		 * @return false Sinon
		 */
		else if (s.equalsIgnoreCase("black") || s.equalsIgnoreCase("noir")
				|| s.equalsIgnoreCase("blanc") || s.equalsIgnoreCase("white")
				|| s.equalsIgnoreCase("blue") || s.equalsIgnoreCase("bleu")
				|| s.equalsIgnoreCase("cyan")
				|| s.equalsIgnoreCase("jaune") || s.equalsIgnoreCase("yellow")
				|| s.equalsIgnoreCase("red") || s.equalsIgnoreCase("rouge")
				|| s.equalsIgnoreCase("rose") || s.equalsIgnoreCase("pink")
				|| s.equalsIgnoreCase("orange") || s.equalsIgnoreCase("magenta") 
				|| s.equalsIgnoreCase("lightgray") || s.equalsIgnoreCase("grisclair")
				|| s.equalsIgnoreCase("green") || s.equalsIgnoreCase("vert")
				|| s.equalsIgnoreCase("gray") || s.equalsIgnoreCase("gris")
				|| s.equalsIgnoreCase("darkgray") || s.equalsIgnoreCase("grisfonce")) {
					return true;
			} else {
			Fenetre.jTextAreaHistory
					.addError("L'ortographe de votre couleur n'est pas correcte ou n'existe pas");
			return false;
		}
		return true;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see commande.Commande#random()
	 */
	public int random() {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		int red = randomGenerator.nextInt(255);
		int green = randomGenerator.nextInt(255);
		int blue = randomGenerator.nextInt(255);

		Color randomColour = new Color(red, green, blue);
		Integer c = new Integer(randomColour.getRGB());
		return c.intValue();
	}
}
