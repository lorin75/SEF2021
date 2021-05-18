import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class OrdersList{

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
    public OrdersList() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        Status = new JFrame();
        Status.setBounds(100, 100, 450, 350);
        Status.setTitle("Orders List");
        Status.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Status.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Hello! Here you can see the orders");
        lblNewLabel.setForeground(Color.BLUE);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
        lblNewLabel.setBounds(78, 35, 306, 29);
        Status.getContentPane().add(lblNewLabel);

        JButton order1 = new JButton("Order 1");
        order1.setBounds(133, 88, 170, 29);
        Status.getContentPane().add(order1);

        JButton order2 = new JButton("Order 2");
        order2.setBounds(133, 141, 170, 29);
        Status.getContentPane().add(order2);
    }
}