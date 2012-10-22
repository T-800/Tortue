package commande;
import java.awt.Color;

import javax.swing.JPanel;
import objetQuiDessine.CurseurQuiDessine;

public class BackgroundColor implements Commande {

	
		public static Color convertiCouleur(String s){
			s.toLowerCase();
			if(s.equals("black")||s.equals("noir")||s.equals("#000000")){
				return Color.black;
			}
			if(s.equals("blanc")||s.equals("white")||s.equals("#ffffff")){
				return Color.white;
			}
			if(s.equals("blue")||s.equals("bleu")||s.equals("#0000ff")){
				return Color.blue;
			}
			if(s.equals("cyan")||s.equals("#00ffff")){
				return Color.cyan;
			}
			if(s.equals("jaune")||s.equals("yellow")||s.equals("#ffff00")){
				return Color.yellow;
			}
			if(s.equals("red")||s.equals("rouge")||s.equals("#ff0000")){
				return Color.red;
			}
			if(s.equals("rose")||s.equals("pink")||s.equals("#fd6c9e")){
				return Color.pink;
			}
			if(s.equals("orange")||s.equals("#ed7f10")){
				return Color.orange;
			}
			if(s.equals("magenta")||s.equals("#ff00ff")){
				return Color.magenta;
			}
			if(s.equals("lightgray")||s.equals("gris clair")||s.equals("#afafaf")){
				return Color.lightGray;
			}
			if(s.equals("green")||s.equals("vert")||s.equals("#00ff00")){
				return Color.green;
			}
			if(s.equals("gray")||s.equals("gris")||s.equals("#606060")){
				return Color.gray;
			}
			if(s.equals("darkgray")||s.equals("gris fonce")||s.equals("#463F32")){
				return Color.darkGray;
			}		
			System.out.println("Aucune couleur ne correspond a votre entree\nVeuillez recommencer");
			return Color.white;
		}
		@Override
		public void execute(String[] parametres, JPanel dessin,
				CurseurQuiDessine curseur) {
			// TODO Auto-generated method stub
			curseur.setCouleur(Color.red);
		}
		@Override
		public Object[] convertTo(String[] parametres) {
			// TODO Auto-generated method stub
			return null;
		}
			
		
}
