package ihm;

import java.awt.Color;

import javax.swing.JEditorPane;

public class PanelHistory extends JEditorPane {
	String text = "";

	public PanelHistory() {
		this.setBackground(Color.white);
		this.setEditable(false);
		this.setContentType("text/html");

	}

	public void addTexte(String txt) {
		text += "> " + txt.replace("\n", "<br>") + "<br>";

		this.setContenu();
	}

	public void addTexteIndent(String txt) {
		text += "&nbsp;&nbsp;&nbsp;" + txt.replace("\n", "<br>");

		this.setContenu();
	}

	public void addError(String txt) {
		text += "<font color=#FF0000> " + txt + "</font><br>";
		this.setContenu();
	}

	public void addCom(String txt) {
		text += "<font color=#007FAE> " + txt + "</font><br>";
		this.setContenu();
	}

	public void addVar(String txt) {
		text += "<font color=#00FF00> " + txt + "</font><br>";
		this.setContenu();
	}

	public void clear() {
		text = "";
		this.setContenu();
	}

	private void setContenu() {

		this.setText("<html><head></head><body><p style=\"margin-top: 0\">"
				+ text + "</p></body></html>");
		// System.out.println("<html><head></head><body><p style=\"margin-top: 0\">"+text+"</p></body></html>");
	}

}
