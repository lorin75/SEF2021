import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FoodMenu{

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
    public FoodMenu() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        Status = new JFrame();
        Status.setBounds(100, 100, 650, 530);
        Status.setTitle("Food Menu.");
        Status.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Status.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Please select one or more products.");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
        lblNewLabel.setBounds(78, 35, 306, 29);
        Status.getContentPane().add(lblNewLabel);

        JButton choice1 = new JButton("Grilled chicken with baked potatoes.");

        choice1.setBounds(10, 90, 250, 29);
        Status.getContentPane().add(choice1);

        JLabel message1 = new JLabel("200 gr. chicken, 150 gr. poattoes , chilli sauce , mixed salad");
        message1.setForeground(Color.BLACK);
        message1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        message1.setBounds(260, 84, 500, 29);
        Status.getContentPane().add(message1);

        JLabel price1 = new JLabel("25 RON");
        price1.setForeground(Color.BLACK);
        price1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        price1.setBounds(260, 95, 500, 29);
        Status.getContentPane().add(price1);

        JButton choice2 = new JButton("Chicken nuggets with fries.");

        choice2.setBounds(10, 145, 250, 29);
        Status.getContentPane().add(choice2);

        JLabel message2 = new JLabel("200 gr. chicken , 200 gr. fries , roumulade sauce");
        message2.setForeground(Color.BLACK);
        message2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        message2.setBounds(260, 139, 500, 29);
        Status.getContentPane().add(message2);

        JLabel price2 = new JLabel("28 RON");
        price2.setForeground(Color.BLACK);
        price2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        price2.setBounds(260, 150, 500, 29);
        Status.getContentPane().add(price2);


        JButton choice3 = new JButton("Pork ribs with wedgies potatoes.");

        choice3.setBounds(10, 200, 250, 29);
        Status.getContentPane().add(choice3);

        JLabel message3 = new JLabel("400 gr ribs, 200 gr wedgies , bbq sause, mix salad");
        message3.setForeground(Color.BLACK);
        message3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        message3.setBounds(260, 194, 500, 29);
        Status.getContentPane().add(message3);

        JLabel price3 = new JLabel("35 RON");
        price3.setForeground(Color.BLACK);
        price3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        price3.setBounds(260, 205, 500, 29);
        Status.getContentPane().add(price3);

        JButton choice4 = new JButton("Penne carbonara.");

        choice4.setBounds(10, 255, 250, 29);
        Status.getContentPane().add(choice4);

        JLabel message4 = new JLabel("200 gr. pasta, heavy cream, bacon , garlic");
        message4.setForeground(Color.BLACK);
        message4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        message4.setBounds(260, 249, 500, 29);
        Status.getContentPane().add(message4);

        JLabel price4 = new JLabel("23 RON");
        price4.setForeground(Color.BLACK);
        price4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        price4.setBounds(260, 260, 500, 29);
        Status.getContentPane().add(price4);

        JButton choice5 = new JButton("Pizza capriciosa.");

        choice5.setBounds(10, 310, 250, 29);
        Status.getContentPane().add(choice5);

        JLabel message5 = new JLabel("550 gr -> champignon, bell pepper, onion, parma, olive");
        message5.setForeground(Color.BLACK);
        message5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        message5.setBounds(260, 304, 500, 29);
        Status.getContentPane().add(message5);

        JLabel price5 = new JLabel("22 RON");
        price5.setForeground(Color.BLACK);
        price5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        price5.setBounds(260, 315, 500, 29);
        Status.getContentPane().add(price5);

        JButton choice6 = new JButton("Beef burger.");

        choice6.setBounds(10, 365, 250, 29);
        Status.getContentPane().add(choice6);

        JLabel message6 = new JLabel("150 gr. beef patty, 150 gr. poattoes ( on choice) , bbq sauce , cabbage salad");
        message6.setForeground(Color.BLACK);
        message6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        message6.setBounds(260, 359, 500, 29);
        Status.getContentPane().add(message6);

        JLabel price6 = new JLabel("30 RON");
        price6.setForeground(Color.BLACK);
        price6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        price6.setBounds(260, 370, 500, 29);
        Status.getContentPane().add(price6);

        JLabel submit_message = new JLabel("Go to shopping cart.");
        submit_message.setForeground(Color.BLACK);
        submit_message.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        submit_message.setBounds(200, 450, 500, 29);
        Status.getContentPane().add(submit_message);

        JButton Submit_button = new JButton("SUBMIT.");
        Submit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Status.dispose();
                //new ShoppingCart().setVisible(true);
            }
        });
        Submit_button.setBounds(200, 420, 250, 29);
        Status.getContentPane().add(Submit_button);



    }


}