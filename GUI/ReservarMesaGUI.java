package GUI;

import javax.swing.*;

public class ReservarMesaGUI extends JFrame{
    private JPanel contentPanel;
    private JPanel panelMesaSim;
    private JRadioButton mesaGrandeRadioButton;
    private JRadioButton mesaPequeñaRadioButton;
    private JButton reservarButton;
    private JTextField nroDePersonasTextField;
    private JButton siguienteButton;

    public ReservarMesaGUI(){
        setContentPane(contentPanel);
        setSize(600,400);
    }

    public static void main(String[] args) {
        ReservarMesaGUI dialog = new ReservarMesaGUI();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
