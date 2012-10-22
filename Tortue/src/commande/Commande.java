package commande;


import history.HistoryTortue;

import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;

public interface Commande {
	
	HistoryTortue history = new HistoryTortue();
	public void execute(String [] parametres, JPanel dessin, CurseurQuiDessine curseur) throws IOException ;
	
	public Object[] convertTo(String [] parametres);

}
