import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Calculator implements ActionListener {
	protected JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,cl,eff,plus,moin,multi,div ;
	protected JTextField txt ;
	private void ins (JButton bt){
	bt.setFocusPainted(false);
	bt.setBorderPainted(false);
	}
	private double dblstr (String v){
	return Double.parseDouble(v);
	}
	private String calculemultiplex(ArrayList<String> numbers, ArrayList<String> opers) {
        if (numbers.size() == 0 ){
	return "0" ;
	}
	int i = 0;
	while (i<opers.size()){
	 String op = opers.get (i);
	 if (op.equals("*") ){
	 double a =dblstr(numbers.get(i));
	 double b = dblstr(numbers.get(i+1));
	 double res = a*b;
	 numbers.set(i,String.valueOf(res));
	 numbers.remove(i+1);
	 opers.remove(i);
	 }//if *
	 else {
		 if (op.equals("/")){
		 double a = dblstr(numbers.get(i));
		 double b = dblstr(numbers.get(i+1));
		 double res = a/b;
		 numbers.set (i,String.valueOf(res));
		 numbers.remove(i+1);
		 opers.remove(i);
		 }// if /
		 else {
		 i++;
		 }
	 }//else /
         
	}//while
	if (!opers.isEmpty()){
	do {
	int ix = 0 ;
		double res = 0 ;
	String op = opers.get(ix);
	if (op.equals("+")){
	double a = dblstr(numbers.get(ix));
	double b = dblstr(numbers.get(ix+1));
	 res = a+b;}else{
        double a = dblstr(numbers.get(ix));
		double b = dblstr(numbers.get(ix));
		res =a-b;
	}
	numbers.set(ix,String.valueOf(res));
	numbers.remove(ix+1);
	opers.remove(ix);
	}
	}while(!opers.isEmpty());
	}
	return numbers.get(0);
	}//function

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
	Calculator c = new Calculator ();
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
	txt.setText("");
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
	if (e.getSource() == eff){
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
			
			}	}
           
             String se= String.valueOf(xe);
                txt.setText(se);	       	}else {
             
               		
		ArrayList <String > opers = new ArrayList <>();
		ArrayList <String > numbers = new ArrayList <>();
                  Matcher m = Pattern.compile("\\d+\\.?\\d*|[+\\-*/]").matcher (s);		
		  while (m.find()){
			String ko = m.group ();
		if(ko.equals("+") || ko.equals("-") || ko.equals("*") || ko.equals("/")){
		opers.add(ko);
		}else{
		numbers.add(ko);
		}
		}
		String natija = calculemultiplex(numbers,opers);
		txt.setText(natija);
          
      	}/*else*/
        
		}
	
	}}
