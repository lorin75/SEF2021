import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class CustomerLogin extends JFrame implements ActionListener {
    private JFrame Customer;
    private JTextField txtTypeName;
    private JPasswordField passwordFiled;
    private JDialog Dialog;


    public void setVisible(boolean visible) {
        if (Customer != null) {
            Customer.setVisible(visible);
        }
    }

    public CustomerLogin() {
        initialize();
    }

    private void initialize() {
        Customer = new JFrame("OrderRestaurant");
        Customer.getContentPane().setBackground(SystemColor.window);
        Customer.getContentPane().setForeground(Color.BLACK);
        Customer.setTitle("Food Ordering System");
        Customer.setBounds(100, 100, 450, 300);
        Customer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Customer.getContentPane().setLayout(null);

        JLabel lblWelcome = new JLabel("Please log in!");
        lblWelcome.setForeground(Color.BLACK);
        lblWelcome.setBounds(150, 21, 229, 39);
        Customer.getContentPane().add(lblWelcome);

        JLabel lblUser = new JLabel("User Name");
        lblUser.setForeground(Color.BLUE);
        lblUser.setBounds(93, 72, 96, 29);
        Customer.getContentPane().add(lblUser);

        txtTypeName = new JTextField();
        txtTypeName.setBounds(227, 73, 130, 26);
        Customer.getContentPane().add(txtTypeName);
        txtTypeName.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLUE);
        lblPassword.setBounds(93, 121, 96, 29);
        Customer.getContentPane().add(lblPassword);

        passwordFiled = new JPasswordField();
        passwordFiled.setBounds(227, 122, 130, 26);
        Customer.getContentPane().add(passwordFiled);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        btnLogin.setBounds(72, 186, 117, 29);
        Customer.getContentPane().add(btnLogin);

        JButton btnSignUp = new JButton("Sign Up");
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Customer.dispose();
                new Register().setVisible(true);
            }
        });
        btnSignUp.setBounds(260, 186, 117, 29);
        Customer.getContentPane().add(btnSignUp);

    }

    public void actionPerformed(ActionEvent e){

        String userName = txtTypeName.getText();
        String password = passwordFiled.getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            new FoodMenu().setVisible(true);
        } else {

        }
    }
}