import javax.swing.*;

public class HotelDescription extends JDialog {
    private JPanel contentPane;
    private JPanel panelHotel;
    private JTextArea textAreaOpiniones;
    private JLabel labelDireccion;
    private JLabel labelFoto;
    private JButton siguienteButton;
    private JButton opinarButton;
    private JLabel labelDescription;
    private JCheckBox estacionamientoCheckBox;
    private JTextPane textPane1;
    private JCheckBox restauranteCheckBox;
    private JCheckBox habitacionesCheckBox;
    private JButton buttonOK;

    public HotelDescription() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        HotelDescription dialog = new HotelDescription();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
