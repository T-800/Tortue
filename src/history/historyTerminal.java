package history;

import java.util.ArrayList;

/**
 * Cette classe gère l'historique du "Terminal". Tout ce qui est tappée dans le
 * terminal et validée avec entrer est stocké dans un ArrayList
 * 
 * @author Renaud
 * 
 */
public class historyTerminal {

	/**
	*
	*/
	private static ArrayList<String> history;
	static int current;

	public historyTerminal() {
		history = new ArrayList<String>();
		current = 0;

	}

	public static void addToHistory(String Comande) {
		history.add(Comande);
		current++;
	}

	public String showUp() {
		if (current == 0) {
			historyTerminal.current = 0;
			if (history.isEmpty()) {
				return "";
			} else
				return history.get(0);
		}
		return history.get(current--);
	}

	public String showDown() {
		if (history.isEmpty()) {
			return "";
		}
		historyTerminal.current++;
		if (current >= history.size()) {
			historyTerminal.current = history.size() - 1;
			return "";
		}
		return history.get(current);
	}

	public void reset() {
		current = history.size() - 1;
	}

}
