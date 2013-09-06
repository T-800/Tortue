package ihm;

import history.historyTerminal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;

import commande.Autocompletion;
import commande.HashTable;

public class jInviteDeCommande extends JTextField {

	public historyTerminal historyTerminal;
	public HashTable table = new HashTable(Fenetre.jTextAreaHistory);

	public jInviteDeCommande(PanelHistory panelHistory, Dessin dessin) {
		this.setBackground(Color.black);

		this.setPreferredSize(new Dimension(Fenetre.largeur - 10, 30));

		this.setForeground(Color.white);
		historyTerminal = new historyTerminal();
		this.setFocusTraversalKeysEnabled(false);
		addKeyListener(new KeyListenTerminal(this));
	}

	public class KeyListenTerminal implements KeyListener {
		public jInviteDeCommande terminal;

		public KeyListenTerminal(jInviteDeCommande terminal) {
			this.terminal = terminal;

		}

		@Override
		public void keyPressed(KeyEvent e) {

			String s;
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				terminal.historyTerminal.reset();

				s = terminal.getText();
				s = s.trim();
				if (s.equals("")) {

					return;
				}
				terminal.setText("");
				history.historyTerminal.addToHistory(s);
				try {
					HashTable.hgj(s, true);

				} catch (NullPointerException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				terminal.setText(historyTerminal.showUp());
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				terminal.setText(historyTerminal.showDown());
			} else if ((e.getKeyCode() == KeyEvent.VK_TAB)) {
				historyTerminal.reset();
				s = terminal.getText();
				s = s.trim();

				ArrayList<String> tab = Autocompletion.complete(s);
				if (tab.size() > 1) {
					terminal.setText(tab.get(tab.size() - 1).trim());
					for (int i = 0; i < tab.size() - 1; i++) {
						Fenetre.jTextAreaHistory.addTexteIndent("- " + tab.get(i)
								+ "\n");
					}
				} else if (tab.size() == 1) {
					terminal.setText(tab.get(tab.size() - 1).trim());
				}

			} else if ((e.getKeyCode() == KeyEvent.VK_L)
					&& ((e.getModifiers() & InputEvent.CTRL_MASK) != 0)) {
				Fenetre.jTextAreaHistory.clear();

			}

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

}
