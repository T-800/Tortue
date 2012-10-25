package ihm;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings({ "rawtypes", "serial" })
public class JComboBoxColor extends JComboBox implements ActionListener{
	public Color [] colorsList;
	 
	   @SuppressWarnings("unchecked")
	public JComboBoxColor(Color [] cl)
	   {
	      super();
	      colorsList = cl;
	      ColorComboRenderer renderer = new ColorComboRenderer();
	      for (int i=0;i<cl.length;i++)
	      {
	         JLabel lbl = new JLabel("COLOR" );
	         lbl.setBackground(cl[i]);
	         lbl.setForeground(cl[i]);
	         this.addItem(lbl);
	      }
	      this.addActionListener(this);
	      this.setRenderer(renderer);
	   }
	   
	   public class ColorComboRenderer extends DefaultListCellRenderer
	   {
	     
	      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
	      {
	         ColorComboRenderer c = (ColorComboRenderer)(super.getListCellRendererComponent(list, value, index, isSelected,cellHasFocus));
	         if (index==-1)
	         {
	            c.setText("COLOR" );
	            c.setBackground( Color.BLACK );
	            c.setForeground( Color.BLACK );
	         }
	         else
	         {
	            c.setText("COLOR" );
	            c.setBackground( ((JLabel)value).getBackground() );
	            c.setForeground( ((JLabel)value).getBackground() );
	         }
	         return c;
	      }
}
}
