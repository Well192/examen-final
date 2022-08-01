import javax.swing.*;
import java.awt.event.*;

public class MenuPrincipal extends JDialog {
    private JPanel contentPane;
    private JComboBox comboBox2;
    private JComboBox comboBox1;
    private JButton siguienteButton;

    public MenuPrincipal() {
        setContentPane(contentPane);
        setModal(true);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        MenuPrincipal dialog = new MenuPrincipal();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
