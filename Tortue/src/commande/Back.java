package commande;


import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Back implements Commande {

	@Override
	public void execute(String[] parametres, JPanel dessin,CurseurQuiDessine curseur) throws IOException {
		history.addToHistory(parametres[0]);
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
