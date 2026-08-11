import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener {
	protected JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,cl,eff,plus,moin,multi,div ;
	protected JTextField txt ;
	private void ins (JButton bt){
	bt.setFocusPainted(false);
	bt.setBorderPainted(false);
	}
	private double dblstr(String k){
        try {
		double f=0;
	return f= Double.parseDouble(k);
	}catch (NumberFormatException ex2){
	txt.setText("false");
	return 0;
	}
	}
	private void blackops (String part,String op){
	String[]table=part.split(op);
	double resultat = 0 ;
	for (int j =0 ;j<=(table.length -1);j++){
	if (op=="+"){
	resultat +=dblstr(table[j]);
	}//if
	 if (op=="-"){
        resultat -=dblstr(table[j]);
        }//if
	 if (op=="*"){
        resultat *=dblstr(table[j]);
        }//if
	 if (op=="/"){
        resultat /=dblstr(table[j]);
        }//if
	part = String.valueOf(resultat);
	}//for
	
	}//proce

	public void  calcule () {
	JPanel p1 = new JPanel () ; 
	JPanel p2 = new JPanel () ;
	JPanel p3 = new JPanel () ;
	JFrame f = new JFrame ("calculator ");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(1000,600);
	/*panel 1 txt */
	txt = new JTextField ();
	txt.setEditable(false);
	txt.setFont(new Font("Arial",Font.BOLD,24));
	txt.setPreferredSize(new Dimension (200,100));
	f.add(txt,BorderLayout.NORTH);
	/*panel 3/4 */
	p2.setBackground(new Color (1,1,1));
	p3.setBackground(new Color (1,1,1));
	p2.setPreferredSize(new Dimension (200,200));
	p3.setPreferredSize(new Dimension (200,200));
	plus = new JButton ("+");
	plus.setPreferredSize(new Dimension (190,110));
	moin=new JButton ("--");
	moin.setPreferredSize(new Dimension (190,110));
	multi= new JButton ("*");
	multi.setPreferredSize(new Dimension (190,110));
	div = new JButton ("/");
	div.setPreferredSize(new Dimension (190,110));
	plus.setBackground (new Color (68,54,47));
	plus.setForeground (new Color (255,255,255));
	moin.setBackground (new Color (68,54,47));
	moin.setForeground (new Color (255,255,255));
	multi.setBackground (new Color (68,54,47));
	multi.setForeground (new Color (255,255,255));
	div.setBackground (new Color (68,54,47));
	div.setForeground (new Color (255,255,255));
	p3.add(plus);
	p3.add(moin);
	p3.add(multi);
	p3.add(div);
	ins(plus);
	ins(moin);
	ins(multi);
	ins(div);
	f.add(p2,BorderLayout.EAST);
	f.add(p3,BorderLayout.WEST);
	/*main panel */
	p1.setLayout(new GridLayout(4,3));
	b0= new JButton("0");
	ins(b0);
	b0.setBackground (new Color (255,255,255));
        b1= new JButton("1");
	ins(b1);
	b1.setBackground (new Color (255,255,255));
        b2= new JButton("2");
	ins(b2);
	b2.setBackground (new Color (255,255,255));
        b3= new JButton("3");
	ins(b3);
        b3.setBackground (new Color (255,255,255));	
	b4= new JButton("4");
	ins(b4);
	b4.setBackground (new Color (255,255,255));
        b5= new JButton("5");
	ins(b5);
	b5.setBackground (new Color (255,255,255));
	b6= new JButton("6");
	ins(b6);
	b6.setBackground (new Color (255,255,255));
	b7= new JButton("7");
	ins(b7);
	b7.setBackground (new Color (255,255,255));
	b8= new JButton("8");
	ins(b8);
	b8.setBackground (new Color (255,255,255));
	b9= new JButton("9");
	ins(b9);
	b9.setBackground (new Color (255,255,255));
	cl= new JButton("clear");
	ins(cl);
	eff= new JButton("=");
	ins(eff);
	cl.setBackground(new Color(255,165,0));
	eff.setBackground(new Color(255,165,0));
        p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(b7);
	p1.add(b8);
	p1.add(b9);
	p1.add(cl);
        p1.add(b0);
        p1.add(eff);
	f.add(p1,BorderLayout.CENTER);
	/*action listener*/
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	eff.addActionListener(this);
	cl.addActionListener(this);
	plus.addActionListener(this);
	moin.addActionListener(this);
	multi.addActionListener(this);
	div.addActionListener(this);
	f.setVisible(true);
	}
	public static void main (String []args){
	calculator c = new calculator ();
	c.calcule ();
	}
	@Override 
	public void actionPerformed(ActionEvent e ) {
	
		String s = txt.getText();
	if (e.getSource() == b0){
		txt.setText(s+"0");
	
	}
	if (e.getSource() == b1){
                txt.setText(s+"1");

        }

	if (e.getSource() == b2){
                txt.setText(s+"2");

        }
        if (e.getSource() == b3){
                txt.setText(s+"3");

        }
        if (e.getSource() == b4){
                txt.setText(s+"4");

        }
        if (e.getSource() == b5){
                txt.setText(s+"5");

        }
        if (e.getSource() == b6){
                txt.setText(s+"6");

        }
        if (e.getSource() == b7){
                txt.setText(s+"7");

        }
        if (e.getSource() == b8){
                txt.setText(s+"8");

        }
        if (e.getSource() == b9){
                txt.setText(s+"9");

        }
        if (e.getSource () == cl ){
	txt.setText(" ");
	}
	 if (e.getSource() == plus){
                txt.setText(s+"+");

        }
	 if (e.getSource() == moin){
                txt.setText(s+"-");

        }
	 if (e.getSource() == multi){
                txt.setText(s+"*");

        }
	 if (e.getSource() == div){
                txt.setText(s+"/");

        }
	if (e.getSource () == eff ) {
		String [] parts= s.split("[+*/\\-]");
		if (parts.length == 2 ){
		double c = Double.parseDouble(parts[0]);
		double d = Double.parseDouble(parts[1]);
		double xe =0 ;
		if (s.contains("+")){
                xe = c+d;
		}
		if(s.contains("-")){
                xe = c- d;

		}
		if (s.contains("*")){
                xe=c*d;
                }
		if (s.contains("/")){
			try {
                xe=c/d;
		 
		
			}catch(ArithmeticException ex){
				txt.setText("non solution");
			
			}
                
	       	}
             String se= String.valueOf(xe);
                txt.setText(se);
	    
	}else{
	String []parts2 = s.split("+"); 
        double riad = 0 ;	
	for (int km = 0 ;km<=(parts2[km].length()-1);km++){
	if (parts2[km].contains("-")){
		  String []parts3 = s.split("-");
		  for (int km1 = 0 ;km1<=(parts3[km1].length()-1);km1++){
	  if (parts3[km1].contains("*")){
		    String []parts4 = s.split("*");
		    for (int km2 = 0 ;km2<=(parts4[km2].length()-1);km2++){
	    if (parts4[km2].contains("/")){
             blackops(parts4[km2],"/");
               
	    
	    
	    }
	  }
	  blackops(parts3[km1],"*");
	  }
		  }
		  blackops(parts2[km],"-");
		  }
	
	riad =riad + dblstr(parts2[km]);
	}

	String walid = String.valueOf(riad);
	txt.setText(walid);
      	}/*else*/
        
	
	
	}}	}
