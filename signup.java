import javax.swing.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener {

    // JFrame f;
    JTextField tf1; 
    JPasswordField tf2;
    JButton login;
    String str,str2;

    signup(){
        setLayout(null);
        setTitle("Login Form");
        setBounds(300,100,500,500);
        
        JLabel lb1=new JLabel("Username:");
        lb1.setBounds(80,125,70,30);
        add(lb1);

        tf1=new JTextField("");
       tf1.setBounds(180,125,100,30);
       add(tf1);

       JLabel lb2=new JLabel("Password");
       lb2.setBounds(80,180,70,30);
       add(lb2);

       tf2=new JPasswordField();
       tf2.setBounds(180,180,100,30);
       add(tf2);

       login=new JButton("Login");
       login.setBounds(150,260,100,30);
       add(login);
       login.addActionListener(this);

       setVisible(true);

    }

    public static void main(String[] args) {
        new signup();
    }

    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==login){
    str=tf1.getText();
    str2=tf2.getText();
    if(str.equals("123")&& str2.equals("rundy")){
        System.out.println("Successfully Logined");
    }

    }
    }
}
