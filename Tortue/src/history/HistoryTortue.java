package history;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Vector;

/**
 * Cette classe gère tout ce qui est en rapport avec l'historique et ses fichiers :
 * - savegarde de l'historique en dur
 * - savegarde de l'historique dans un fichier temporaire 
 * - ajout de la derniere comande a l'istorique temporaire
 * - suppression de la derniere ligne de l'historique (cmd UNDO)
 * @author Renaud
 */ 	

public class HistoryTortue implements History {
	
	
	File history;
	FileWriter historyWrite;
	FileReader historyRead;
	BufferedWriter output; 
	BufferedReader reader;
	
	public HistoryTortue() {
		
		history = new File("tmp//history.txt");
		
		System.out.println(this.empty());
		history.delete();
		try {
			historyWrite = new FileWriter(history,true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		output = new BufferedWriter(historyWrite); 
		try {
			reader = new BufferedReader(new FileReader(history));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.empty());

	}
	


	/*FINI ET TESTE*/
	public void addToHistory(String comande) throws IOException {
		try 
		{ 

		
		output.write(comande+"\r\n"); 
		output.flush(); 
		//output.close(); 

		} 
		catch(IOException ioe){ 
		System.out.println("erreur : " + ioe ); 
		} 
	}

	/*FINI ET TESTE*/
	public void removeToHistory() throws IOException ,FileNotFoundException{
		try {
			reader = new BufferedReader(new FileReader(history));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 int lastLine = numberLastLine();
		if(lastLine ==0){
			return;
		}
		System.out.println("lastline : "+lastLine);
		Vector<String> monVector = new Vector<String>(); 
         
        String ligne = reader.readLine(); 
        System.out.println(ligne);
        while (ligne != null){ 
            monVector.addElement(ligne); 
           
            System.out.println("Vecteur Avant "+ligne);
            ligne = reader.readLine(); 
        }
       
        monVector.removeElementAt(lastLine-1);
       PrintWriter P = new PrintWriter (new FileWriter(history)); 
        for (int i = 0; i < monVector.size(); i++){
        	//history.delete();
        	P.println(monVector.get(i)); 
            System.out.println("vecteur Apres : "+monVector.get(i));
        }
        P.flush();
        P.close();
         
		
	}

	/*A TESTER --> CHEMIN*/
	public void saveHistory(String nomDessin, String chemin) {
		File destination = new File(chemin+"//"+nomDessin+"CMD.txt");
		history.renameTo(destination);
		
	}

	/*FINI ET TESTE*/
	public boolean empty() {
		return !(history.length()>0);
	}
	
	/**
	 * 
	 * @return le nombre de ligne qui est utile pour supprimer la derniere ligne
	 * @throws IOException
	 */
	public int numberLastLine() throws IOException{
		
		FileInputStream fis = new FileInputStream(history);
		LineNumberReader l = new LineNumberReader(       
		       new BufferedReader(new InputStreamReader(fis)));
		
		//LineNumberReader l = new LineNumberReader(reader);
		int ligne = 0;
		String str;
		
		 while ((str=l.readLine())!=null)
         {
            ligne = l.getLineNumber();
            System.out.println("L : "+ligne);
         }
        System.out.println("ligne N° "+ligne);
      
        return ligne;
	}
	
	
	public static void main(String [] args) throws IOException {
		HistoryTortue h = new HistoryTortue();
		h.addToHistory("un");
		h.addToHistory("deux");
		h.addToHistory("trois");
		h.addToHistory("quatre");
		h.removeToHistory();
		h.removeToHistory();
		System.out.println(h.empty());

	}
	



}
