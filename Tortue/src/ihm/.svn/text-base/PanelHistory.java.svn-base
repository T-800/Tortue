package ihm;

import javax.swing.JEditorPane;

public class PanelHistory {
	
	JEditorPane panel;
	String text="";
	
	public PanelHistory() {
		panel =new JEditorPane();
		this.panel.setEditable(false);
		this.panel.setContentType("text/html");
		
	}
	
	public void addTexte(String txt){
		text+=">"+txt.replace("\n","<br>")+"<br>";
		this.setContenu();
	}
	
	public void addError(String txt){
		text+="<font color=#FF0000> Cette commande "+txt.replace("\n","<br>")+" n'éxiste pas</font><br>";
		this.setContenu();
	}
	
	private void setContenu(){
		this.panel.setText("<html><head></head><body><p style=\"margin-top: 0\">"+text+"</p></body></html>");
	}

}
