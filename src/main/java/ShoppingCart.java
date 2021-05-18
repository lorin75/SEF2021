import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ShoppingCart{

    private JFrame Status;

    /**
     * Launch the application.
     */


    public void setVisible(boolean visible) {
        if (Status != null) {
            Status.setVisible(visible);
        }
    }
    /**
     * Create the application.
     */
    public ShoppingCart() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        Status = new JFrame();
        Status.setBounds(100, 100, 650, 470);
        Status.setTitle("Shopping Cart");
        Status.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Status.getContentPane().setLayout(null);


        JLabel message1 = new JLabel("Here's your ordered food");
        message1.setForeground(Color.BLACK);
        message1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        message1.setBounds(78, 35, 306, 29);
        Status.getContentPane().add(message1);


        JLabel message2 = new JLabel("No ordered food yet");
        message2.setForeground(Color.BLACK);
        message2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        message2.setBounds(260, 139, 500, 29);
        Status.getContentPane().add(message2);

    }
}