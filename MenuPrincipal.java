import javax.swing.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame {
    private JPanel contentPane;
    private JComboBox comboBox2;
    private JComboBox comboBox1;
    private JButton siguienteButton;

    public MenuPrincipal() {
        setContentPane(contentPane);
        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        MenuPrincipal dialog = new MenuPrincipal();
        dialog.pack();
        dialog.setVisible(true);
    }
}
