package history;

import java.io.IOException;



public interface History {
	

	/**
	 * Ajoute la derniere commande au fichier History.tmp.
	 * Sauf pour les commandes (SAVE; UNDO; OPEN; EARASE)
	 * @param Comande Derniere commande entrée par l'utilisateur 
	 * @throws IOException 
	 */
	public void addToHistory(String Comande) throws IOException;
	
	
	/**
	 * Supprime la derniere ligne du fichier 
	 * Utiliser par la commande UNDO et EARASE
	 * Comme ça les commandes annulées par UNDO ne feront pas partie de l'istorique
	 * Pour EARASE cette commande s'appelle recursivement avec la fonction {@link #empty()} en test
	 * @throws IOException 
	 * @see #empty()
	 */
	public void removeToHistory() throws IOException;
	
	
	/**
	 * Sauvegarde le fichier History.tmp dans un fichier NomDuDessin.txt
	 * Dans le chemain donné en parametre
	 * @param NomDessin le fichier History aura le meme nom que le dessin
	 * @param chemin Chemin où sera sauvegardé le fichier
	 */
	public void saveHistory(String NomDessin, String chemin);
	
	/**
	 * Regarde si le fichier est vide pour la commande UNDO EARASE:
	 * si le fichier est vide la commande UNDO ou EARASE n'est pas éxécutée
	 * @return true si le fichier est vide
	 */
	public boolean empty();

}
