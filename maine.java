import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class maine implements ActionListener {
    protected static JButton  btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,cl,eff ;
    protected static  JLabel l1,l2,l3,l4;
    public static void maine ()
        
        {
            JFrame f = new JFrame ("riad");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500,250 );
            f.setVisible(true);
            f.setLayout(new BorderLayout());
            // panel 1
            JPanel p1 = new JPanel();
            l1 = new JLabel ();
            p1.add(l1);

        
} 
public static void main(String[] args) {
    new maine();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }}