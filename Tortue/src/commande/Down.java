package commande;



import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Down implements Commande{
	
	public static void execute(SymboleQuiDessine s,int d){
		s.setDirection(270);
	}

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}
}