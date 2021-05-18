import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class ManagerLogin extends JFrame implements ActionListener {
    private JFrame Manager;
    private JTextField txtTypeName;
    private JPasswordField passwordFiled;
    private JDialog Dialog;


    public void setVisible(boolean visible) {
        if (Manager != null) {
            Manager.setVisible(visible);
        }
    }

    public ManagerLogin() {
        initialize();
    }

    private void initialize() {
        Manager = new JFrame("OrderRestaurant");
        Manager.getContentPane().setBackground(SystemColor.window);
        Manager.getContentPane().setForeground(Color.BLACK);
        Manager.setTitle("Food Ordering System");
        Manager.setBounds(100, 100, 450, 300);
        Manager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Manager.getContentPane().setLayout(null);

        JLabel lblWelcome = new JLabel("Welcome mister manager!");
        lblWelcome.setForeground(Color.BLACK);
        lblWelcome.setBounds(108, 21, 229, 39);
        Manager.getContentPane().add(lblWelcome);

        JLabel lblUser = new JLabel("Name");
        lblUser.setForeground(Color.BLUE);
        lblUser.setBounds(93, 72, 96, 29);
        Manager.getContentPane().add(lblUser);

        txtTypeName = new JTextField();
        //txtTypeName.setText("Enter Name");
        txtTypeName.setBounds(227, 73, 130, 26);
        Manager.getContentPane().add(txtTypeName);
        txtTypeName.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLUE);
        lblPassword.setBounds(93, 121, 96, 29);
        Manager.getContentPane().add(lblPassword);

        passwordFiled = new JPasswordField();
        passwordFiled.setBounds(227, 122, 130, 26);
        Manager.getContentPane().add(passwordFiled);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        btnLogin.setBounds(72, 186, 117, 29);
        Manager.getContentPane().add(btnLogin);

    }

    public void actionPerformed(ActionEvent e){

        String userName = txtTypeName.getText();
        String password = passwordFiled.getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            //new OrdersList().setVisible(true);
        } else {

        }
    }
}