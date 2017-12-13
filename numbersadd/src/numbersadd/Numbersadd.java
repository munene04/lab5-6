package numbersadd;
import java.awt.*;
import javax.swing.*;

public class Numbersadd extends  JFrame{
JTextField Fnt,Snt,Rst;
JLabel Fn,Sn,Rs;
JButton Add,Clear,Exit;
public Numbersadd(){
Add = new JButton("Add");
Clear = new JButton("Clear");
Fn=new JLabel("First number: ");
Sn=new JLabel("Second number: ");
Rs=new JLabel("Result: ");
Fnt = new JTextField(10);
Snt = new JTextField(10);
Rst = new JTextField(10);
Exit= new JButton("Exit");
setSize(300, 400); setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
Container cp = getContentPane();
cp.setLayout(new FlowLayout(FlowLayout.CENTER));
JPanel user = new JPanel();
user.setBorder(BorderFactory.createTitledBorder("Numbers Addition"));
user. setLayout(new GridLayout(4,2));
add(user,BorderLayout.EAST);JPanel left = new JPanel ();left.add(Fn);left.add(Fnt);user.add(left);
add(user,BorderLayout.WEST);JPanel right = new JPanel ();right.add(Sn);right.add(Snt);user.add(right);
add(user,BorderLayout.SOUTH);JPanel bottom = new JPanel ();bottom.add(Rs);bottom.add(Rst);
bottom.add(Add);bottom.add(Clear);user.add(bottom);

//user.add(left.createH
}
  
    
    
    public static void main(String[] args) {
      Numbersadd a = new Numbersadd() ;
      a.show();
      
    }
    
}
