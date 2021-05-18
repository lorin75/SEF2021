import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import java.sql.* ;


public  class Register {
    private JFrame AccountRegister = null;
    private JDialog Dialog;
    private JTextField textFieldName=new JTextField();
    private JTextField textFieldBirthday=new JTextField();
    private JTextField textFieldEmail=new JTextField();
    private JPasswordField passwordField=new JPasswordField();
    private JTextField textFieldAddress=new JTextField();
    private JTextField textFieldCellPhone=new JTextField();



    public void setVisible(boolean visible) {
        if (AccountRegister != null) {
            AccountRegister.setVisible(visible);
        }
    }

    public Register() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        AccountRegister = new JFrame("Account Register");
        AccountRegister.setBounds(100, 100, 450, 300);
        AccountRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccountRegister.getContentPane().setLayout(null);

        JLabel lblName = new JLabel("User Name");
        lblName.setForeground(Color.BLUE);
        lblName.setBounds(33, 9, 75, 21);
        AccountRegister.getContentPane().add(lblName);

        textFieldName = new JTextField();
        textFieldName.setBounds(116, 6, 130, 26);
        AccountRegister.getContentPane().add(textFieldName);
        textFieldName.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLUE);
        lblPassword.setBounds(33, 40, 61, 16);
        AccountRegister.getContentPane().add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(116, 36, 130, 26);
        AccountRegister.getContentPane().add(passwordField);

        JLabel lblCellPhone = new JLabel("Phone Number");
        lblCellPhone.setForeground(Color.BLUE);
        lblCellPhone.setBounds(33, 110, 75, 21);
        AccountRegister.getContentPane().add(lblCellPhone);

        textFieldCellPhone = new JTextField();
        textFieldCellPhone.setBounds(116, 105, 130, 26);
        AccountRegister.getContentPane().add(textFieldCellPhone);
        textFieldCellPhone.setColumns(10);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(Color.BLUE);
        lblEmail.setBounds(33, 138, 61, 16);
        AccountRegister.getContentPane().add(lblEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(116, 133, 130, 26);
        AccountRegister.getContentPane().add(textFieldEmail);
        textFieldEmail.setColumns(10);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setForeground(Color.BLUE);
        lblAddress.setBounds(33, 193, 61, 16);
        AccountRegister.getContentPane().add(lblAddress);

        textFieldAddress = new JTextField();
        textFieldAddress.setBounds(115, 185, 310, 33);
        AccountRegister.getContentPane().add(textFieldAddress);
        textFieldAddress.setColumns(10);

        JButton btnConfirm = new JButton("Confirm");
        btnConfirm.addActionListener(new ActionListener() {

            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {

            }

        });
        btnConfirm.setBounds(67, 232, 117, 29);
        AccountRegister.getContentPane().add(btnConfirm);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AccountRegister.dispose();
                new StartPage().setVisible(true);

            }
        });
        btnCancel.setBounds(243, 232, 117, 29);
        AccountRegister.getContentPane().add(btnCancel);

    }

}