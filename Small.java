import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    // JFrame f;
    JTextField tf1, tf2;
    JButton login;

    Login(){
        setLayout(null);
        setTitle("Login Form");
        setBounds(300,100,500,500);
        setVisible(true);
        JLabel lb1=new JLabel("Username:");
        lb1.setBounds(80,125,70,30);
        add(lb1);
        tf1=new JTextField("");
       tf1.setBounds(180,125,70,30);
       add(tf1);

    }

    public static void main(String[] args) {
        new Login();
    }

    public void actionPerformed(ActionEvent ae) {

    }
}
