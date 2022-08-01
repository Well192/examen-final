import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HotelDescription extends JFrame {

    private JPanel contentPane;
    private JLabel labelDireccion;

    public HotelDescription() {
        setContentPane(contentPane);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        HotelDescription hotelDescription = new HotelDescription();
        hotelDescription.pack();
        hotelDescription.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
