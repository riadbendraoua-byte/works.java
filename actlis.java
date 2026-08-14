import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class actlis implements ActionListener {
	
		protected JButton b1,b2;
                protected JLabel l;
		private void ins (JButton bt){
	bt.setFocusPainted(false);
	bt.setBorderPainted(false);
	}
	public void act () {
	JFrame f = new JFrame ("miniprogram(essayer)");
	JPanel p1 = new JPanel ();
	 JPanel p2 = new JPanel ();
	/*panel 1*/
	l=new JLabel ("choose one ");
	p1.setLayout(new BorderLayout ());
	p1.add(l);
	//panel 2
	b1=new JButton ("spider man brand new day ");
	b2=new JButton ("avengers doomsday");
	b1.setBackground (new Color (255,1,1));
	b2.setBackground (new Color (1,255,1));
	ins(b1);
	ins(b2);
	p2.add(b1);
	p2.add(b2);
	f.add(p1,BorderLayout.NORTH);
	f.add(p2,BorderLayout.CENTER);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.setSize(800,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	f.setVisible(true);
	}	
	public static void main (String [] args ){
	actlis a = new actlis ();
	a.act ();
	}
	@Override 
       public void actionPerformed (ActionEvent e){
       if (e.getSource() == b1 ){
       l.setText("watched");
       } else {
       l.setText("in december");
       }
       }	
}
