/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import objetQuiDessine.CurseurQuiDessine;
import commande.HashTable;
/**
 *
 * @author Lunarc
 */
@SuppressWarnings("serial")
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        Curseur=new CurseurQuiDessine();
        refresh();
    }
    public static void refresh(){
    	jLabelTextPosition.setText(Curseur.getAbscisse()+" "+Curseur.getOrdonnee());
    	jLabelTextDirection.setText(Curseur.getDirection()+"");
    	jLabelTextPensize.setText(Curseur.getPensize()+"");
    	if(Curseur.isPendown()){
    		jLabelTextDessine.setText("oui");
    	}
    	else{
    		jLabelTextDessine.setText("non");
    	}
    	
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
    	Color[] c={Color.black,Color.red,Color.darkGray,Color.gray,Color.green,
    			Color.lightGray,Color.magenta,Color.orange,Color.pink,Color.yellow,
    			Color.cyan,Color.blue,Color.white};
    	jComboBoxCouleur =new JComboBoxColor(c);		
    	jComboBoxCouleur.setMaximumRowCount(10);
    	jComboBoxCouleur.setSelectedIndex(0);
    	
    	//initialisation du Panel Parametre
        jPanelParametres = new javax.swing.JPanel();
        jLabelDirection = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelPensize = new javax.swing.JLabel();
        jLabelCouleur = new javax.swing.JLabel();
        
        jLabelDessine = new javax.swing.JLabel();
        jLabelTextDirection = new javax.swing.JLabel();
        jLabelTextPosition = new javax.swing.JLabel();
        jLabelTextPensize = new javax.swing.JLabel();
        jLabelTextDessine = new javax.swing.JLabel();
        
        //initialisation du Dessin
        jPanelDessin = new Dessin();
        
        //initialisation du panel History
        jScrollPaneHistory = new javax.swing.JScrollPane();
        jTextAreaHistory = new javax.swing.JTextArea();
        jTextAreaHistory.setLineWrap(true);
        jTextAreaHistory.setWrapStyleWord(true);
        //initialisation de l'invite de Commande
        jInviteDeCommande = new javax.swing.JTextField();
        jInviteDeCommande.addKeyListener(new KeyListen());
        
        //initialisation de la fenetre(resolution+opération de fermeture)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());

        jPanelParametres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelDirection.setText("Direction:");

        jLabelPosition.setText("Position:");

        jLabelPensize.setText("Pensize");

        jLabelCouleur.setText("Couleur");

        jLabelDessine.setText("Dessine");

        jLabelTextDirection.setText(" ");

        jLabelTextPosition.setText(" ");

        jLabelTextPensize.setText(" ");

        jLabelTextDessine.setText(" ");

        //positionnement des fenetres les unes par rapport aux autres à l'aide d'un Layout
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanelParametres);
        jPanelParametres.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelDessine)
                .addGap(18, 18, 18)
                .addComponent(jLabelTextDessine)
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCouleur)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPensize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextPensize)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextDirection)
                                    .addComponent(jLabelTextPosition))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextDirection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosition)
                    .addComponent(jLabelTextPosition))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPensize, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextPensize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDessine)
                    .addComponent(jLabelTextDessine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCouleur)
                    .addComponent(jComboBoxCouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelDessin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDessin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelDessin.setPreferredSize(new java.awt.Dimension(3, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanelDessin);
        jPanelDessin.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextAreaHistory.setColumns(20);
        jTextAreaHistory.setRows(5);
        jTextAreaHistory.setFocusable(false);
        jScrollPaneHistory.setViewportView(jTextAreaHistory);

        jInviteDeCommande.setBackground(new java.awt.Color(0, 0, 0));
        jInviteDeCommande.setForeground(new java.awt.Color(255, 255, 255));
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDessin, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                    .addComponent(jInviteDeCommande, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelParametres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDessin, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addComponent(jScrollPaneHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelParametres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInviteDeCommande))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
   
    
    @SuppressWarnings({ "rawtypes", "unused" })
	private javax.swing.JComboBox jComboBoxCouleur;
    private javax.swing.JLabel jLabelDirection;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPensize;
    private javax.swing.JLabel jLabelCouleur;
    private javax.swing.JLabel jLabelDessine;
    private javax.swing.JPanel jPanelParametres;
    private javax.swing.JPanel jPanelDessin;
    private javax.swing.JScrollPane jScrollPaneHistory;
    private javax.swing.JTextArea jTextAreaHistory;
    private javax.swing.JTextField jInviteDeCommande;
    private static CurseurQuiDessine Curseur;
    private static javax.swing.JLabel jLabelTextDirection;
    private static javax.swing.JLabel jLabelTextPosition;
    private static javax.swing.JLabel jLabelTextPensize;
    private static javax.swing.JLabel jLabelTextDessine;
    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int)tailleEcran.getHeight();
    static int largeur = (int)tailleEcran.getWidth();
   
    // End of variables declaration
   

	public class KeyListen implements KeyListener {
		HashTable Hash=new HashTable();

		public KeyListen() {
		
		}

		public void keyTyped(KeyEvent e) {
			/* Cette méthode est appelée quand l'utilisateur appuie sur une touche Unicode (donc les caractères) et ne prend pas en compte les touches comme F1, Echap, ALT, etc. */
		}

		/* Cette méthode est appelée quand l'utilisateur appuie sur une touche.
		 */
		
	public void keyPressed(KeyEvent e) {
		
		String s;
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			 s=jInviteDeCommande.getText();
			 s=s.trim();
			 if(s.equals("")){
				 
			 }
			 else{
             jTextAreaHistory.append(s+"\r\n");
             jInviteDeCommande.setText(" ");
             
			 }
			 s=s+" ;";
			 s=s.toUpperCase();
			 Hash.hgj(s, Curseur, jPanelDessin);
			 refresh();
		}
	}

	//Étape 6 : on implémente la méthode keyReleased définie dans l'interface KeyListener
	public void keyReleased(KeyEvent e) {
		// Le fonctionnement est le même que pour keyPressed, sauf que cette méthode est appelée quand la touche est relâchée.
	}

	}
	public class MouseListen implements MouseListener{


		 //Méthode appelée lors du clic de souris
		  public void mouseClicked(MouseEvent event) { }
		  	
		  //Méthode appelée lors du survol de la souris
		  public void mouseEntered(MouseEvent event) { }

		  //Méthode appelée lorsque la souris sort de la zone du bouton
		  public void mouseExited(MouseEvent event) { }

		  //Méthode appelée lorsque l'on presse le bouton gauche de la souris
		  public void mousePressed(MouseEvent event) { }

		  //Méthode appelée lorsque l'on relâche le clic de souris
		  public void mouseReleased(MouseEvent event) { } 
		
	}
	public class ActionListen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
}
}
